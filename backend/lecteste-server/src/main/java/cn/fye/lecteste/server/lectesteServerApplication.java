package cn.fye.lecteste.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SuppressWarnings("SpringComponentScan")
@SpringBootApplication(scanBasePackages = {"${hm.info.base-package}.server", "${hm.info.base-package}.module"})
public class lectesteServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(cn.fye.lecteste.server.lectesteServerApplication.class, args);
    }
}
