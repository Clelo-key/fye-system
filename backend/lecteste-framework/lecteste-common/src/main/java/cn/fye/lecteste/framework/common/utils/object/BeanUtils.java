package cn.fye.lecteste.framework.common.utils.object;

import cn.hutool.core.bean.BeanUtil;

/**
 * @author FYE
 */
public class BeanUtils {
    public static <T> T toBean(Object source, Class<T> targetClass) {
        return BeanUtil.toBean(source, targetClass);
    }
}
