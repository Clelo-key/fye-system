package cn.fye.cloud.framework.web.handler;

import cn.fye.clould.framework.common.pojo.CommonResult;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static cn.fye.clould.framework.common.exception.enums.GlobalErrorCodeConstants.INTERNAL_SERVER_ERROR;
import static cn.fye.clould.framework.common.exception.enums.GlobalErrorCodeConstants.NULL_POINT_ERROR;
import static org.eclipse.jetty.http.HttpStatus.Code.BAD_REQUEST;

/**
 * @Author: Fly
 * @CreateTime: 2025-03-17
 * @Version: 1.0
 */
@RestControllerAdvice
@AllArgsConstructor
public class GlobalExceptionHandler {
    /**
     * 处理 SpringMVC 参数校验不正确
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public CommonResult<?> methodArgumentNotValidExceptionExceptionHandler(MethodArgumentNotValidException ex) {
//        log.warn("[methodArgumentNotValidExceptionExceptionHandler]", ex);
        FieldError fieldError = ex.getBindingResult().getFieldError();
        assert fieldError != null; // 断言，避免告警
        return CommonResult.error(BAD_REQUEST.getCode(), String.format("请求参数不正确:%s", fieldError.getDefaultMessage()));
    }

    /**
     * 处理系统异常，兜底处理所有的一切
     */
    @ExceptionHandler(value = ServletException.class)
    public CommonResult<?> ServletExceptionHandler(HttpServletRequest req, Throwable ex) {

        // 情况二：处理异常
//        log.error("[defaultExceptionHandler]", ex);
        // 插入异常日志
//        createExceptionLog(req, ex);
        // 返回 ERROR CommonResult
        return CommonResult.error(INTERNAL_SERVER_ERROR.getCode(), ex.getMessage());
    }
    /**
     * 空指针
     * */
    @ExceptionHandler(NullPointerException.class)
    public CommonResult<?> nullPointerExceptionHandler(NullPointerException ex) {
        return CommonResult.error(NULL_POINT_ERROR.getCode(),"空指针异常");
    }

    /**
     * 处理系统异常，兜底处理所有的一切
     */
    @ExceptionHandler(value = Exception.class)
    public CommonResult<?> defaultExceptionHandler(HttpServletRequest req, Throwable ex) {

        // 情况二：处理异常
//        log.error("[defaultExceptionHandler]", ex);
        // 插入异常日志
//        createExceptionLog(req, ex);
        // 返回 ERROR CommonResult
        return CommonResult.error(INTERNAL_SERVER_ERROR.getCode(), INTERNAL_SERVER_ERROR.getMsg());
    }


}
