package cn.fye.lecteste.server.config;

import cn.fye.lecteste.server.pojo.Pet;
import cn.fye.lecteste.server.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class TestConfig {
    @Bean("myUser")
    public User user01(){
        User zhangshan = new User("zhangshan", 12);
        zhangshan.setPet(UserPet());
        return zhangshan;
    }

    @Bean("userPet")
    public Pet UserPet(){
        return new  Pet("xiaohuang",1);
    }
}
