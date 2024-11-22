package cn.fye.lecteste.module.system.api.test;

import org.springframework.stereotype.Component;

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
