package cn.fye.lecteste.framework.mybatis.config;

import org.apache.ibatis.annotations.Mapper;
import com.baomidou.mybatisplus.autoconfigure.MybatisPlusAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.AutoConfiguration;

/**
 * @author FYE
 */

@AutoConfiguration(before = MybatisPlusAutoConfiguration.class) // 目的：先于 MyBatis Plus 自动配置，避免 @MapperScan 可能扫描不到 Mapper 打印 warn 日志
@MapperScan(value = "${lecteste.info.base-package}", annotationClass = Mapper.class)
public class LectesteMybatisAutoConfiguration {
}
