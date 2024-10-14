package cn.fye.lecteste.module.system.api.test;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author FYE
 */
@Component
public class TestApiImpl implements TestApi{
    @Override
    public String getString() {
        return "测试成功";
    }
}
