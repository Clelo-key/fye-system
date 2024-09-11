package com.hmdp.filter;

import com.alibaba.fastjson2.JSON;
import com.hmdp.dto.Result;
import com.hmdp.utils.JwtUtils;
import io.jsonwebtoken.Claims;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Objects;

@WebFilter(urlPatterns = "/*")
public class LoginCheckFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        String requestURI = httpRequest.getRequestURI();
        if (Objects.equals(requestURI, "/user/login")){
            filterChain.doFilter(servletRequest,servletResponse);
            System.out.println(requestURI);
            return;
        }
        String token = httpRequest.getHeader("token");
        if(!(token.length() >0)){
            System.out.println("请求头为空");
            Result loginErr = Result.fail("当前未登录");
            String s = JSON.toJSONString(loginErr);
            servletResponse.getWriter().write(s);
        }
        try {
            Claims claims = JwtUtils.getClaims(token);
            System.out.println(claims);
            filterChain.doFilter(servletRequest,servletResponse);

        }catch (Exception e){
            System.out.println("令牌解析失败");
            Result loginErr = Result.fail("当前未登录");
            String s = JSON.toJSONString(loginErr);
            servletResponse.getWriter().write(s);
            return;
        }

    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
