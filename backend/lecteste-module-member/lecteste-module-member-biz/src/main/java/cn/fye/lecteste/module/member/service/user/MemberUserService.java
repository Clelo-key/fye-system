package cn.fye.lecteste.module.member.service.user;

import cn.fye.lecteste.module.member.dal.dataobject.user.MemberUserDO;

/**
 * @author FYE
 */
public interface MemberUserService {
    MemberUserDO getUserByMobile(String mobile);
}
