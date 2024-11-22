package cn.fye.lecteste.module.member.service.auth;


import cn.fye.lecteste.framework.common.enums.CommonStatusEnum;
import cn.fye.lecteste.module.member.controller.app.auth.vo.AppAuthLoginReqVO;
import cn.fye.lecteste.module.member.controller.app.auth.vo.AppAuthLoginRespVO;
import cn.fye.lecteste.module.member.dal.dataobject.user.MemberUserDO;
import cn.fye.lecteste.module.member.service.user.MemberUserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import static cn.fye.lecteste.framework.common.exception.utils.ServiceExceptionUtil.exception;
import static  cn.fye.lecteste.module.member.enums.ErrorCodeConstants.*;
/**
 * 会员的认证 Service 接口
 * 提供用户的账号密码登录、token 的校验等认证相关的功能
 *
 * @author 芋道源码
 */
@Service
public class MemberAuthServiceImpl implements MemberAuthService {
    @Resource
    private MemberUserService userService;

    /**
     * 用户登录
     * */
    @Override
    public AppAuthLoginRespVO login(AppAuthLoginReqVO reqVO) {
        System.out.println(reqVO.toString());
        return null;
    }

    /**
     * 退出登录
     * */
    @Override
    public void logout(String token) {

    }

    /**
     * 刷新Token
     * */
    @Override
    public AppAuthLoginRespVO refreshToken(String refreshToken) {
        return null;
    }

    private MemberUserDO checkLoginStatus(String mobile, String password) {
        // 检验账户是否存在
        MemberUserDO user = userService.getUserByMobile(mobile);
        if (user == null) {
            throw exception(AUTH_LOGIN_BAD_CREDENTIALS);
        }
        if (!userService.isPasswordMatch(password, user.getPassword())) {
            throw exception(AUTH_LOGIN_BAD_CREDENTIALS);
        }
        // 校验是否禁用
        if (CommonStatusEnum.isDisable(user.getStatus())) {
            throw exception(AUTH_LOGIN_USER_DISABLED);
        }
        return user;
    }
}
