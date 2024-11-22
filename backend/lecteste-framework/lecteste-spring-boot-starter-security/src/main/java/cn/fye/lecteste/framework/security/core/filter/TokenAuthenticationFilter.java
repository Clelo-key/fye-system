package cn.fye.lecteste.framework.security.core.filter;

import cn.fye.lecteste.framework.common.pojo.CommonResult;
import cn.fye.lecteste.framework.security.config.SecurityProperties;
import cn.fye.lecteste.framework.security.core.LoginUser;
import cn.fye.lecteste.framework.security.core.utils.SecurityFrameworkUtils;
import cn.fye.lecteste.framework.web.core.handler.GlobalExceptionHandler;
import cn.fye.lecteste.module.system.api.oauth2.OAuth2TokenApi;
import cn.hutool.core.util.StrUtil;
import jakarta.annotation.Resource;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.AllArgsConstructor;
import org.mapstruct.ap.internal.model.common.FinalField;
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
                if (loginUser == null) {
                    loginUser = mockLoginUser(request, token, userType);
                }

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

}

