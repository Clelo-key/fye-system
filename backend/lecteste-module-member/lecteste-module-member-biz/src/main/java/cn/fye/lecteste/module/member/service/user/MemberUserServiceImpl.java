package cn.fye.lecteste.module.member.service.user;

import cn.fye.lecteste.framework.common.enums.CommonStatusEnum;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import cn.fye.lecteste.module.member.dal.dataobject.user.MemberUserDO;
import cn.fye.lecteste.module.member.dal.mysql.user.MemberUserMapper;
import org.springframework.security.crypto.password.PasswordEncoder;


/**
 * @author FYE
 */
@Service
public class MemberUserServiceImpl implements MemberUserService {
    @Resource
    private MemberUserMapper memberUserMapper;

    @Resource
    private PasswordEncoder passwordEncoder;

    @Override
    public MemberUserDO getUserByMobile(String mobile) {
        return memberUserMapper.selectByMobile(mobile);
    }

    @Override
    public boolean isPasswordMatch(String rawPassword, String encodedPassword) {
        return passwordEncoder.matches(rawPassword, encodedPassword);
    }

    @Override
    public MemberUserDO createUser(String mobile, String nikeName,String password) {
        return createUserI(mobile, nikeName,password);
    }


    /**
     * 对密码进行加密
     *
     * @param password 密码
     * @return 加密后的密码
     */
    private String encodePassword(String password) {
        return passwordEncoder.encode(password);
    }

    private MemberUserDO createUserI(String mobile, String nickname, String password) {
        // 插入用户
        MemberUserDO user = new MemberUserDO();
        user.setMobile(mobile);
        user.setStatus(CommonStatusEnum.ENABLE.getStatus()); // 默认开启
        user.setPassword(encodePassword(password)); // 加密密码
        if (StrUtil.isEmpty(nickname)) {
            // 昵称为空时，随机一个名字，避免一些依赖 nickname 的逻辑报错，或者有点丑。例如说，短信发送有昵称时~
            user.setNickname("用户" + RandomUtil.randomNumbers(6));
        }
        memberUserMapper.insert(user);
        return user;
    }

}
