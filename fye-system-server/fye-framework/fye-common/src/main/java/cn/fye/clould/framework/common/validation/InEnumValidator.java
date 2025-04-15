package cn.fye.clould.framework.common.validation;

import cn.fye.clould.framework.common.core.ArrayValuable;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author: Fly
 * @CreateTime: 2025-04-14
 * @Version: 1.0
 */
public class InEnumValidator implements ConstraintValidator<InEnum, Object> {
    private List<?> values;

    @Override
    public void initialize(InEnum constraintAnnotation) {
        ArrayValuable<?>[] values = constraintAnnotation.value().getEnumConstants();
        if (values.length == 0) {
            this.values = Collections.emptyList();
        } else {
            this.values = Arrays.asList(values[0].array());
        }
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext constraintValidatorContext) {
        // 为空时，默认不校验，即认为通过
        if (value == null) {
            return true;
        }
        // 校验通过
        if (values.contains(value)) {
            return true;
        }
        // 校验不通过，自定义提示语句
        constraintValidatorContext.disableDefaultConstraintViolation(); // 禁用默认的 message 的值
        constraintValidatorContext.buildConstraintViolationWithTemplate(constraintValidatorContext.getDefaultConstraintMessageTemplate()
                .replaceAll("\\{value}", values.toString())).addConstraintViolation(); // 重新添加错误提示语句
        return false;
    }
}
