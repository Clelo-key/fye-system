package cn.fye.lecteste.module.member.service.user;

import cn.fye.lecteste.framework.common.pojo.CommonResult;
import cn.fye.lecteste.module.member.dal.dataobject.user.MemberUserDO;
import cn.fye.lecteste.module.member.dal.mysql.user.MemberUserMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;


/**
 * @author FYE
 */
@Service
public class MemberUserServiceImpl implements MemberUserService {
    @Resource
    MemberUserMapper memberUserMapper;

    @Override
    public MemberUserDO getUserByMobile(String mobile) {
        return memberUserMapper.selectByMobile(mobile);
    }
}
