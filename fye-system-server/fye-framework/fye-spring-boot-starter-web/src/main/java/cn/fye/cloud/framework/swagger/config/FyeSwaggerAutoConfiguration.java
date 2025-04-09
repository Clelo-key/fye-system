package cn.fye.cloud.framework.swagger.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;


/**
 * @Author: Fly
 * @CreateTime: 2025-03-12
 * @Version: 1.0
 */
@AutoConfiguration
@EnableConfigurationProperties(SwaggerProperties.class)
public class FyeSwaggerAutoConfiguration {
    @Bean
    public OpenAPI springOpenAPI(SwaggerProperties swaggerProperties) {
        return new OpenAPI()
                .info(new Info().title(swaggerProperties.getTitle())
                        .description(swaggerProperties.getDescription())
                        .version(swaggerProperties.getVersion()));
    }

    /**
     * 创建了一个api接口的分组
     * 除了配置文件方式创建分组，也可以通过注册bean创建分组
     */
    @Bean
    public GroupedOpenApi adminApi() {
        return GroupedOpenApi.builder()
                // 分组名称
                .group("app-api")
                // 接口请求路径规则
                .pathsToMatch("/**")
                .build();
    }


}
