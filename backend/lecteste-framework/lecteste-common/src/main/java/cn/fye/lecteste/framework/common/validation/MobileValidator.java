package cn.fye.lecteste.framework.common.validation;

import cn.fye.lecteste.framework.common.util.validation.ValidationUtils;
import cn.hutool.core.util.StrUtil;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class MobileValidator implements ConstraintValidator<Mobile, String> {

    @Override
    public void initialize(Mobile constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // 手机号为空，默认不校验
        if (StrUtil.isEmpty(value)){
            return true;
        }
        return ValidationUtils.isMobile(value);
    }
}
