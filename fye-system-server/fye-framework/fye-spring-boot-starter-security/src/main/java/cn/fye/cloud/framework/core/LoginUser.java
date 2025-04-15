package cn.fye.cloud.framework.core;

import cn.fye.clould.framework.common.enums.UserTypeEnum;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author: Fly
 * @CreateTime: 2025-04-12
 * @Version: 1.0
 */
@Data
public class LoginUser {
    /**
     * 用户编号
     */
    private Long id;
    /**
     * 用户类型
     *
     * 关联 {@link UserTypeEnum}
     */
    private Integer userType;
    /**
     * 授权范围
     */
    private List<String> scopes;
    /**
     * 过期时间
     */
    private LocalDateTime expiresTime;
}
