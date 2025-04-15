package cn.fye.cloud.framework.config;

import cn.fye.cloud.framework.core.handler.AccessDeniedHandlerImpl;
import cn.fye.cloud.framework.core.handler.AuthenticationEntryPointImpl;
import jakarta.annotation.Resource;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
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
 * @Author: Fly
 * @CreateTime: 2025-04-12
 * @Version: 1.0
 */
@AutoConfiguration
@EnableConfigurationProperties(SecurityProperties.class)
public class FyeSecurityAutoConfiguration {
    @Resource
    private SecurityProperties securityProperties;

    /**
     * 加密器
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
