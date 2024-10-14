package cn.fye.lecteste.framework.common.exception;

import cn.fye.lecteste.framework.common.exception.enums.ServiceErrorCodeRange;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=false)
@Data
public class ServiceException extends RuntimeException{
    /**
     * 业务错误码
     *
     * @see ServiceErrorCodeRange
     */
    private Integer code;
    /**
     * 错误提示
     */
    private String message;

    /**
     * 空构造方法，避免反序列化问题
     */
    public ServiceException() {
    }
    public ServiceException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
