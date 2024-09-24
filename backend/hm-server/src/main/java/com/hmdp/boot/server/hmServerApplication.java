package com.hmdp.boot.server;

import com.hmdp.boot.server.config.TestConfig;
import com.hmdp.boot.server.pojo.Pet;
import com.hmdp.boot.server.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SuppressWarnings("SpringComponentScan")
@SpringBootApplication(scanBasePackages = {"${hm.info.base-package}.server", "${hm.info.base-package}.module"})
public class hmServerApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(hmServerApplication.class, args);
        Pet userPet = run.getBean("userPet", Pet.class);
        Pet userPet1 = run.getBean("userPet", Pet.class);

        System.out.println(userPet1==userPet);

        TestConfig bean = run.getBean(TestConfig.class);
        User user = bean.user01();

        System.out.println(user.getPet()==userPet);
        System.out.println(run.getBeanDefinitionCount());

    }
}
