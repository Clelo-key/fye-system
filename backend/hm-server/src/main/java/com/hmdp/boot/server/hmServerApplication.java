package com.hmdp.boot.server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SuppressWarnings("SpringComponentScan")
@SpringBootApplication(scanBasePackages = {"${hm.info.base-package}.server", "${hm.info.base-package}.module"})
public class hmServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(hmServerApplication.class, args);
    }
}
