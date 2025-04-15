package cn.fye.cloud.framework.core.filter;

import cn.fye.cloud.framework.core.LoginUser;
import cn.fye.cloud.framework.core.util.SecurityFrameworkUtil;
import cn.fye.cloud.framework.web.handler.GlobalExceptionHandler;
import cn.fye.clould.framework.common.exception.ServiceException;
import cn.fye.clould.framework.common.pojo.CommonResult;
import cn.fye.clould.framework.common.util.json.JsonUtil;
import cn.hutool.core.util.ObjectUtil;
import cn.hutool.core.util.StrUtil;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/**
 * @Author: Fly
 * @CreateTime: 2025-04-12
 * @Version: 1.0
 */
@RequiredArgsConstructor
@Slf4j
public class TokenAuthenticationFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        filterChain.doFilter(request, response);
    }

}
