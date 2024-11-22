package cn.fye.lecteste.module.system.service.oauth2;

import cn.fye.lecteste.module.system.dal.dataobject.oauth2.OAuth2AccessTokenDO;
import cn.fye.lecteste.module.system.dal.dataobject.oauth2.OAuth2ClientDO;
import cn.fye.lecteste.module.system.dal.dataobject.oauth2.OAuth2RefreshTokenDO;
import cn.fye.lecteste.module.system.dal.mysql.oauth2.OAuth2AccessTokenMapper;
import cn.fye.lecteste.module.system.dal.mysql.oauth2.OAuth2RefreshTokenMapper;
import cn.hutool.core.util.IdUtil;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OAuth2TokenServiceImpl implements OAuth2TokenService{
    @Resource
    private OAuth2AccessTokenMapper oauth2AccessTokenMapper;
    @Resource
    private OAuth2RefreshTokenMapper oauth2RefreshTokenMapper;

    @Resource
    private OAuth2TokenService oauth2TokenService;

    @Resource
    private OAuth2ClientService oauth2ClientService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public OAuth2AccessTokenDO createAccessToken(Long userId, Integer userType, String clientId, List<String> scopes) {
        OAuth2ClientDO clientDO = oauth2ClientService.validOAuthClientFromCache(clientId);
        // 创建刷新令牌
        OAuth2RefreshTokenDO refreshTokenDO = createOAuth2RefreshToken(userId, userType, clientDO, scopes);
        // 创建访问令牌
        return createOAuth2AccessToken(refreshTokenDO, clientDO);
    }


    private OAuth2RefreshTokenDO createOAuth2RefreshToken(Long userId, Integer userType, OAuth2ClientDO clientDO, List<String> scopes) {
        OAuth2RefreshTokenDO refreshToken = new OAuth2RefreshTokenDO().setRefreshToken(generateRefreshToken())
                .setUserId(userId).setUserType(userType)
                .setClientId(clientDO.getClientId()).setScopes(scopes)
                .setExpiresTime(LocalDateTime.now().plusSeconds(clientDO.getRefreshTokenValiditySeconds()));
        oauth2RefreshTokenMapper.insert(refreshToken);
        return refreshToken;
    }


    private OAuth2AccessTokenDO createOAuth2AccessToken(OAuth2RefreshTokenDO refreshTokenDO, OAuth2ClientDO clientDO) {
        OAuth2AccessTokenDO accessTokenDO = new OAuth2AccessTokenDO().setAccessToken(generateAccessToken())
                .setUserId(refreshTokenDO.getUserId()).setUserType(refreshTokenDO.getUserType())
                .setClientId(clientDO.getClientId()).setScopes(refreshTokenDO.getScopes())
                .setRefreshToken(refreshTokenDO.getRefreshToken())
                .setExpiresTime(LocalDateTime.now().plusSeconds(clientDO.getAccessTokenValiditySeconds()));
        oauth2AccessTokenMapper.insert(accessTokenDO);
        return accessTokenDO;
    }


    private static String generateAccessToken() {
        return IdUtil.fastSimpleUUID();
    }

    private static String generateRefreshToken() {
        return IdUtil.fastSimpleUUID();
    }

    @Override
    public OAuth2AccessTokenDO refreshAccessToken(String refreshToken, String clientId) {
        return null;
    }

    @Override
    public OAuth2AccessTokenDO getAccessToken(String accessToken) {
        return null;
    }

    @Override
    public OAuth2AccessTokenDO checkAccessToken(String accessToken) {
        return null;
    }

    @Override
    public OAuth2AccessTokenDO removeAccessToken(String accessToken) {
        return null;
    }
}
