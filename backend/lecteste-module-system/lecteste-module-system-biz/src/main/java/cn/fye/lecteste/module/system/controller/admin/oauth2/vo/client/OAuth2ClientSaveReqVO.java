package cn.fye.lecteste.module.system.controller.admin.oauth2.vo.client;

import cn.fye.lecteste.framework.common.utils.json.JsonUtils;
import cn.hutool.core.util.StrUtil;
import lombok.Data;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class OAuth2ClientSaveReqVO {

    private Long id;

    @NotNull(message = "客户端编号不能为空")
    private String clientId;

    @NotNull(message = "客户端密钥不能为空")
    private String secret;

    @NotNull(message = "应用名不能为空")
    private String name;

    @NotNull(message = "应用图标不能为空")
    private String logo;

    private String description;

    @NotNull(message = "状态不能为空")
    private Integer status;

    @NotNull(message = "访问令牌的有效期不能为空")
    private Integer accessTokenValiditySeconds;

    @NotNull(message = "刷新令牌的有效期不能为空")
    private Integer refreshTokenValiditySeconds;

    @NotNull(message = "可重定向的 URI 地址不能为空")
    private List<@NotEmpty(message = "重定向的 URI 不能为空") String> redirectUris;

    @NotNull(message = "授权类型不能为空")
    private List<String> authorizedGrantTypes;

    private List<String> scopes;

    private List<String> autoApproveScopes;

    private List<String> authorities;

    private List<String> resourceIds;

    private String additionalInformation;

    @AssertTrue(message = "附加信息必须是 JSON 格式")
    public boolean isAdditionalInformationJson() {
        return StrUtil.isEmpty(additionalInformation) || JsonUtils.isJson(additionalInformation);
    }

}
