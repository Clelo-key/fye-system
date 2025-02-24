package cn.fye.lecteste.module.member.convert.auth;

import cn.fye.lecteste.module.member.controller.app.auth.vo.AppAuthLoginRespVO;
import cn.fye.lecteste.module.system.api.oauth2.dto.OAuth2AccessTokenRespDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @Author: Fly
 * @CreateTime: 2024-11-27
 * @Version: 1.0
 */
@Mapper
public interface AuthConvert {
    AuthConvert INSTANCE = Mappers.getMapper(AuthConvert.class);

    AppAuthLoginRespVO convert(OAuth2AccessTokenRespDTO accessTokenRespDTO);

}
