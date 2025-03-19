package cn.fye.lecteste.module.system.controller.admin.oauth2.vo.client;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class OAuth2ClientRespVO {
    private Long id;

    private String clientId;

    private String secret;

    private String name;

    private String logo;

    private String description;

    private Integer status;

    private Integer accessTokenValiditySeconds;

    private Integer refreshTokenValiditySeconds;

    private List<String> redirectUris;

    private List<String> authorizedGrantTypes;

    private List<String> scopes;

    private List<String> autoApproveScopes;

    private List<String> authorities;

    private List<String> resourceIds;

    private String additionalInformation;

    private LocalDateTime createTime;
}
