package cn.fye.cloud.module.system;

import cn.fye.cloud.framework.web.handler.GlobalExceptionHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author: Fly
 * @CreateTime: 2025-03-05
 * @Version: 1.0
 */
@SpringBootApplication
public class FyeSystemApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(FyeSystemApplication.class, args);
        GlobalExceptionHandler bean = run.getBean(GlobalExceptionHandler.class);
        System.out.println(bean);
    }
}
