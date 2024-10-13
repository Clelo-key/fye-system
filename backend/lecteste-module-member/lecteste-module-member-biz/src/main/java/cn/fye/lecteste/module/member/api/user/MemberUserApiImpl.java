package cn.fye.lecteste.module.member.api.user;

import cn.fye.lecteste.module.member.api.user.dto.MemberUserRespDTO;
import cn.fye.lecteste.module.member.convert.user.MemberUserConvert;
import cn.fye.lecteste.module.member.dal.dataobject.user.MemberUserDO;
import cn.fye.lecteste.module.member.service.user.MemberUserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author FYE
 */

@Service
public class MemberUserApiImpl implements MemberUserApi{
    @Resource
    MemberUserService memberUserService;
    @Override
    public MemberUserRespDTO getUserByMobile(String mobile) {
        MemberUserDO userByMobile = memberUserService.getUserByMobile(mobile);
        return MemberUserConvert.INSTANCE.convert2(userByMobile);
    }


}
