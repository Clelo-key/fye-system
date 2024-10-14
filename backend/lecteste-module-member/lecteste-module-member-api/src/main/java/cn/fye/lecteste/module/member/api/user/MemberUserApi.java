package cn.fye.lecteste.module.member.api.user;

import cn.fye.lecteste.module.member.api.user.dto.MemberUserRespDTO;

/**
 * @author FYE
 */
public interface MemberUserApi {
    /**
     * 获取用户信息
     * @param mobile 用户号码
     * @return 用户信息
     * */
    MemberUserRespDTO getUserByMobile(String mobile);
}
