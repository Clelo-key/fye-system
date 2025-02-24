package cn.fye.lecteste.module.system.service.oauth2;

import cn.fye.lecteste.module.system.controller.admin.oauth2.vo.client.OAuth2ClientSaveReqVO;
import cn.fye.lecteste.module.system.dal.dataobject.oauth2.OAuth2ClientDO;
import cn.hutool.extra.spring.SpringUtil;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.Collection;

@Service
@Validated
public class OAuth2ClientServiceImpl implements OAuth2ClientService{
    @Override
    public Long createOAuth2Client(OAuth2ClientSaveReqVO createReqVO) {
        return null;
    }

    @Override
    public void updateOAuth2Client(OAuth2ClientSaveReqVO updateReqVO) {

    }

    @Override
    public void deleteOAuth2Client(Long id) {

    }

    @Override
    public OAuth2ClientDO getOAuth2Client(Long id) {
        return null;
    }

    @Override
    public OAuth2ClientDO getOAuth2ClientFromCache(String clientId) {
        return null;
    }

    @Override
    public OAuth2ClientDO validOAuthClientFromCache(String clientId) {
        return OAuth2ClientService.super.validOAuthClientFromCache(clientId);
    }

    @Override
    public OAuth2ClientDO validOAuthClientFromCache(String clientId, String clientSecret, String authorizedGrantType, Collection<String> scopes, String redirectUri) {
//        OAuth2ClientDO client = getSelf().getOAuth2ClientFromCache(clientId);
        OAuth2ClientDO client = new OAuth2ClientDO().setClientId(clientId).setAccessTokenValiditySeconds(1000).setRefreshTokenValiditySeconds(10000);
        return client;
    }


    /**
     * 获得自身的代理对象，解决 AOP 生效问题
     *
     * @return 自己
     */
    private OAuth2ClientServiceImpl getSelf() {
        return SpringUtil.getBean(getClass());
    }
}
