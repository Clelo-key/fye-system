package cn.fye.cloud.framework.config;

import cn.fye.cloud.framework.core.filter.TokenAuthenticationFilter;
import cn.hutool.core.collection.CollUtil;
import com.google.common.collect.HashMultimap;
import jakarta.annotation.Resource;
import jakarta.annotation.security.PermitAll;
import org.springframework.http.HttpMethod;
import com.google.common.collect.Multimap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.ApplicationContext;
import org.springframework.security.config.Customizer;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;


import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static cn.fye.clould.framework.common.util.collection.CollectionUtils.convertList;


/**
 * @Author: Fly
 * @CreateTime: 2025-04-12
 * @Version: 1.0
 */
@AutoConfiguration
@EnableWebSecurity
public class FyeWebSecurityConfigurerAdapter {
    @Resource
    private SecurityProperties securityProperties;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(AbstractHttpConfigurer::disable).authorizeHttpRequests(
                auth -> auth.anyRequest().permitAll());
        return http.build();
    }

}
