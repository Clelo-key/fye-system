package cn.fye.cloud.framework.mybatis.core.query;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.support.SFunction;

import java.util.Map;


/**
 * @Author: Fly
 * @CreateTime: 2025-04-15
 * @Version: 1.0
 */
public interface FyeBaseWrapper<T> extends BaseMapper<T> {
    // 尝试封装update,进行指定字段更新
    default <K> int updatePatch(Map<SFunction<T, ?>, Object> fieldMap, SFunction<T, ?> idField, K idValue) {
        LambdaUpdateWrapper<T> wrapper = new LambdaUpdateWrapper<T>().eq(idField, idValue);
        fieldMap.forEach(wrapper::set);
        return update(wrapper);
    }
}
