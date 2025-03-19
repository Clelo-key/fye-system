package cn.fye.lecteste.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

/**
 * @author 17723
 */
@SuppressWarnings("SpringComponentScan")
@SpringBootApplication(scanBasePackages = {"${lecteste.info.base-package}.server", "${lecteste.info.base-package}.module"})
public class lectesteServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(cn.fye.lecteste.server.lectesteServerApplication.class, args);
    }
}
