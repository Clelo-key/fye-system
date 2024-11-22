package cn.fye.lecteste.module.member.service.auth;

import cn.fye.lecteste.module.member.controller.app.auth.vo.AppAuthLoginReqVO;
import cn.fye.lecteste.module.member.controller.app.auth.vo.AppAuthLoginRespVO;

import javax.validation.Valid;

public interface MemberAuthService {
    /**
     * 手机 + 密码登录
     *
     * @param reqVO 登录信息
     * @return 登录结果
     */
    AppAuthLoginRespVO login(@Valid AppAuthLoginReqVO reqVO);

    /**
     * 基于 token 退出登录
     *
     * @param token token
     */
    void logout(String token);

    /**
     * 刷新访问令牌
     *
     * @param refreshToken 刷新令牌
     * @return 登录结果
     */
    AppAuthLoginRespVO refreshToken(String refreshToken);
}
