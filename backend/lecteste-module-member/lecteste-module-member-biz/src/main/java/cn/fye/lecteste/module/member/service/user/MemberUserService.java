package cn.fye.lecteste.module.member.service.user;

import cn.fye.lecteste.module.member.dal.dataobject.user.MemberUserDO;

/**
 * @author FYE
 */
public interface MemberUserService {
    MemberUserDO getUserByMobile(String mobile);

    /**
     * 判断密码是否匹配
     *
     * @param rawPassword     未加密的密码
     * @param encodedPassword 加密后的密码
     * @return 是否匹配
     */
    boolean isPasswordMatch(String rawPassword, String encodedPassword);

    /**
     * 基于手机号创建用户。
     * 如果用户已经存在，则直接进行返回
     * @param mobile     手机号
     * @param password   密码
     * @return 用户对象
     */
    MemberUserDO createUser(String mobile,String nikeName, String password);


}
