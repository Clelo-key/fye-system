package cn.fye.lecteste.framework.web.config;

import cn.fye.lecteste.framework.web.core.handler.GlobalExceptionHandler;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author FYE
 */
@AutoConfiguration
@EnableConfigurationProperties(WebProperties.class)
public class LectesteWebAutoConfiguration implements WebMvcConfigurer {
    @Bean
    public GlobalExceptionHandler globalExceptionHandler() {
        return new GlobalExceptionHandler();
    }

}
