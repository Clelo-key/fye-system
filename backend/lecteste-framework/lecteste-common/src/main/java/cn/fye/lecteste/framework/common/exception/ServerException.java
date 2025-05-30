package cn.fye.lecteste.framework.common.exception;

import cn.fye.lecteste.framework.common.exception.enums.GlobalErrorCodeConstants;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=false)
@Data
public class ServerException extends RuntimeException{
    /**
     * 全局错误码
     *
     * @see GlobalErrorCodeConstants
     */
    private Integer code;
    /**
     * 错误提示
     */
    private String message;

    /**
     * 空构造方法，避免反序列化问题
     */
    public ServerException() {
    }

    public ServerException(ErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMsg();
    }

    public ServerException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
