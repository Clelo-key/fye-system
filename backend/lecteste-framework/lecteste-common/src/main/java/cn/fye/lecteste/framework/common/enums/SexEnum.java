package cn.fye.lecteste.framework.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author FYE
 */

@Getter
@AllArgsConstructor
public enum SexEnum {

    /** 男 */
    MALE(1),
    /** 女 */
    FEMALE(2),
    /* 未知 */
    UNKNOWN(0);

    /**
     * 性别
     */
    private final Integer sex;

}