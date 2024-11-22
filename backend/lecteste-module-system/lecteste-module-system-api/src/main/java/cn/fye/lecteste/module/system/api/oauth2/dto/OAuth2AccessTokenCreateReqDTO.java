package cn.fye.lecteste.module.system.api.oauth2.dto;

import cn.fye.lecteste.framework.common.enums.UserTypeEnum;
import cn.fye.lecteste.framework.common.validation.InEnum;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 芋道源码
 */
@Data
public class OAuth2AccessTokenCreateReqDTO  implements Serializable {
    /**
     * 用户编号
     */
    @NotNull(message = "用户编号不能为空")
    private Long userId;
    /**
     * 用户类型
     */
    @NotNull(message = "用户类型不能为空")
    @InEnum(value = UserTypeEnum.class, message = "用户类型必须是 {value}")
    private Integer userType;
    /**
     * 客户端编号
     */
    @NotNull(message = "客户端编号不能为空")
    private String clientId;
    /**
     * 授权范围
     */
    private List<String> scopes;

}
