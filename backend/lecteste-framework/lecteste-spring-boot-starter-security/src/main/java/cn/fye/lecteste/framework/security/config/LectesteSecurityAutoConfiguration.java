package cn.fye.lecteste.framework.security.config;

import cn.fye.lecteste.framework.security.core.handler.AccessDeniedHandlerImpl;
import cn.fye.lecteste.framework.security.core.handler.AuthenticationEntryPointImpl;
import cn.fye.lecteste.framework.security.core.service.SecurityFrameworkService;
import cn.fye.lecteste.framework.security.core.service.SecurityFrameworkServiceImpl;
import cn.fye.lecteste.module.system.api.permission.PermissionApi;
import jakarta.annotation.Resource;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.access.AccessDeniedHandler;

/**
 * @author FYE
 */
@AutoConfiguration
@EnableConfigurationProperties(SecurityProperties.class)
public class LectesteSecurityAutoConfiguration {
    @Resource
    private SecurityProperties securityProperties;

    /**
     * 认证失败处理类 Bean
     */
    @Bean
    public AuthenticationEntryPoint authenticationEntryPoint() {
        return new AuthenticationEntryPointImpl();
    }

    /**
     * 权限不够处理器 Bean
     */
    @Bean
    public AccessDeniedHandler accessDeniedHandler() {
        return new AccessDeniedHandlerImpl();
    }

    @Bean("ss") // 使用 Spring Security 的缩写，方便使用
    public SecurityFrameworkService securityFrameworkService(PermissionApi permissionApi) {
        return new SecurityFrameworkServiceImpl(permissionApi);
    }


    /**
     * Spring Security 加密器
     * 考虑到安全性，这里采用 BCryptPasswordEncoder 加密器
     *
     * @see <a href="http://stackabuse.com/password-encoding-with-spring-security/">Password Encoding with Spring Security</a>
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(securityProperties.getPasswordEncoderLength());
    }

    @Bean
    public UserDetailsService userDetailsService() {
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        String encodePass = passwordEncoder().encode("1234");
        manager.createUser(
                User.withUsername("root").password(encodePass).roles("ADMIN").build()
        );
        manager.createUser(
                User.withUsername("jack").password(encodePass).roles("NORMAL").build()
        );
        return manager;
    }

}
