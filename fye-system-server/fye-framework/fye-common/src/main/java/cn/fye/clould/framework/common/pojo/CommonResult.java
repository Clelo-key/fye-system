package cn.fye.clould.framework.common.pojo;

import cn.fye.clould.framework.common.exception.ErrorCode;
import cn.hutool.core.lang.Assert;
import cn.fye.clould.framework.common.exception.ServiceException;
import cn.fye.clould.framework.common.exception.enums.GlobalErrorCodeConstants;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: Fly
 * @CreateTime: 2025-03-17
 * @Version: 1.0
 */
@Data
public class CommonResult<T> implements Serializable {
    /**
     * 错误码
     *
     * @see ErrorCode#getCode()
     */
    private Integer code;
    /**
     * 返回数据
     */
    private T data;
    /**
     * 错误提示，用户可阅读
     *
     * @see ErrorCode#getMsg() ()
     */
    private String msg;
    /**
     * success
     * */
    public static <T> CommonResult<T> success(T data) {
        CommonResult<T> result = new CommonResult<T>();
        result.code=GlobalErrorCodeConstants.SUCCESS.getCode();
        result.data=data;
        result.msg="";
        return result;
    }
    /**
     * error
     * */
    public static <T> CommonResult<T> error(int code, String msg) {
        if (GlobalErrorCodeConstants.SUCCESS.getCode()==code){
            throw new IllegalArgumentException(msg);
        }
        CommonResult<T> result = new CommonResult<T>();
        result.code=code;
        result.msg=msg;
        return result;
    }

}
