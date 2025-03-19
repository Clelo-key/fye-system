package cn.fye.lecteste.framework.security.core.filter;

import cn.fye.lecteste.framework.common.exception.ServiceException;
import cn.fye.lecteste.framework.common.pojo.CommonResult;
import cn.fye.lecteste.framework.common.util.servlet.ServletUtils;
import cn.fye.lecteste.framework.security.config.SecurityProperties;
import cn.fye.lecteste.framework.security.core.LoginUser;
import cn.fye.lecteste.framework.security.core.util.SecurityFrameworkUtils;
import cn.fye.lecteste.framework.web.core.handler.GlobalExceptionHandler;
import cn.fye.lecteste.module.system.api.oauth2.OAuth2TokenApi;
import cn.fye.lecteste.module.system.api.oauth2.dto.OAuth2AccessTokenCheckRespDTO;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import cn.fye.lecteste.framework.web.core.util.WebFrameworkUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

/**
 * @author FYE
 *
 * Token 过滤器，验证 token 的有效性。
 * 将通过验证的信息加入到Spring security中
 */

@AllArgsConstructor
public class TokenAuthenticationFilter extends OncePerRequestFilter {
    private final SecurityProperties securityProperties;
    private final GlobalExceptionHandler globalExceptionHandler;
    private final OAuth2TokenApi oauth2TokenApi;

    @Override
    @SuppressWarnings("NullableProblems")
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
            throws ServletException, IOException {

        String token = SecurityFrameworkUtils.obtainAuthorization(request,
                securityProperties.getTokenHeader(), securityProperties.getTokenParameter());
        if (StrUtil.isNotEmpty(token)) {
            Integer userType = WebFrameworkUtils.getLoginUserType(request);
            try {
                // 1.1 基于 token 构建登录用户
                LoginUser loginUser = buildLoginUserByToken(token, userType);
                // 1.2 模拟 Login 功能，方便日常开发调试
//                if (loginUser == null) {
//                    loginUser = mockLoginUser(request, token, userType);
//                }
                // 2. 设置当前用户
                if (loginUser != null) {
                    SecurityFrameworkUtils.setLoginUser(loginUser, request);
                }
            } catch (Throwable ex) {
                CommonResult<?> result = globalExceptionHandler.allExceptionHandler(request, ex);
                ServletUtils.writeJSON(response, result);
                return;
            }
        }
        // 继续过滤链
        chain.doFilter(request, response);
    }


    private LoginUser buildLoginUserByToken(String token, Integer userType) {
        try {
            OAuth2AccessTokenCheckRespDTO accessToken = oauth2TokenApi.checkAccessToken(token);
            if (accessToken == null) {
                return null;
            }
            // 用户类型不匹配，无权限
            // 注意：只有 /admin-api/* 和 /app-api/* 有 userType，才需要比对用户类型
            // 类似 WebSocket 的 /ws/* 连接地址，是不需要比对用户类型的
            if (userType != null
                    && ObjectUtil.notEqual(accessToken.getUserType(), userType)) {
                throw new AccessDeniedException("错误的用户类型");
            }
            // 构建登录用户
            return new LoginUser().setId(accessToken.getUserId())
                    .setUserType(accessToken.getUserType())
                    .setInfo(accessToken.getUserInfo()) // 额外的用户信息
                    .setScopes(accessToken.getScopes())
                    .setExpiresTime(accessToken.getExpiresTime());
        } catch (ServiceException serviceException) {
            // 校验 Token 不通过时，考虑到一些接口是无需登录的，所以直接返回 null 即可
            System.out.println("Token 不通过"+serviceException.getMessage());
            if (serviceException.getCode()==401){
                throw serviceException;
            }
            return null;
        }
    }

}

