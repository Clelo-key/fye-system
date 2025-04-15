package cn.fye.cloud.framework.web.handler;

import cn.fye.clould.framework.common.pojo.CommonResult;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import static cn.fye.clould.framework.common.exception.enums.GlobalErrorCodeConstants.INTERNAL_SERVER_ERROR;
import static cn.fye.clould.framework.common.exception.enums.GlobalErrorCodeConstants.NULL_POINT_ERROR;
import static org.eclipse.jetty.http.HttpStatus.Code.BAD_REQUEST;
import static org.eclipse.jetty.http.HttpStatus.Code.NOT_FOUND;

/**
 * @Author: Fly
 * @CreateTime: 2025-03-17
 * @Version: 1.0
 */
@RestControllerAdvice
@AllArgsConstructor
@Slf4j
public class GlobalExceptionHandler {
    /**
     * 处理 SpringMVC 参数校验不正确
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public CommonResult<?> methodArgumentNotValidExceptionExceptionHandler(MethodArgumentNotValidException ex) {
        FieldError fieldError = ex.getBindingResult().getFieldError();
        assert fieldError != null; // 断言，避免告警
        return CommonResult.error(BAD_REQUEST.getCode(), String.format("请求参数不正确:%s", fieldError.getDefaultMessage()));
    }

    /**
     * 处理Servlet异常
     */
    @ExceptionHandler(value = ServletException.class)
    public CommonResult<?> ServletExceptionHandler(HttpServletRequest req, Throwable ex) {
        log.error(ex.getMessage(), ex);
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
    @ExceptionHandler(value = NoResourceFoundException.class)
    public CommonResult<?> noResourceFoundExceptionHandler(HttpServletRequest req, Throwable ex) {
        return CommonResult.error(NOT_FOUND.getCode(), ex.getMessage());
    }

    /**
     * 处理系统异常，兜底处理所有的一切
     */
    @ExceptionHandler(value = Exception.class)
    public CommonResult<?> defaultExceptionHandler(HttpServletRequest req, Throwable ex) {
        return CommonResult.error(INTERNAL_SERVER_ERROR.getCode(), ex.getMessage());
    }


}
