package cn.fye.cloud.module.system.service.user;

import cn.fye.cloud.module.system.convert.AdminUserConvert;
import cn.fye.cloud.module.system.dal.dataobject.user.AdminUserDO;
import cn.fye.cloud.module.system.dal.dataobject.user.vo.UserRespVO;
import cn.fye.cloud.module.system.dal.dataobject.user.vo.UserSaveReqVO;
import cn.fye.cloud.module.system.dal.mysql.user.AdminUserMapper;
import cn.fye.clould.framework.common.exception.ServiceException;
import com.google.common.annotations.VisibleForTesting;
import jakarta.annotation.Resource;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import static cn.fye.clould.framework.common.exception.enums.GlobalErrorCodeConstants.USER_NOT_EXISTS;

/**
 * @Author: Fly
 * @CreateTime: 2025-03-16
 * @Version: 1.0
 */
@Service
public class AdminUserServiceImpl implements AdminUserService {

    @Resource
    AdminUserMapper adminUserMapper;

    @Resource
    private PasswordEncoder passwordEncoder;

    /**
     * 通过Id查询用户
     *
     * @param id 用户id
     * @return 用户对象信息
     */
    public UserRespVO getUserById(Long id) {
        return AdminUserConvert.INSTANCE.ToUserRespVO(adminUserMapper.selectById(id));
    }

    /**
     * 创建用户
     */
    @Override
    public int createUser(UserSaveReqVO userSaveReqVO) {
        userSaveReqVO.setPassword(encodePassword(userSaveReqVO.getPassword()));
        return adminUserMapper.createUser(AdminUserConvert.INSTANCE.convert(userSaveReqVO));
    }

    /**
     * 删除用户
     */
    @Override
    public int deleteUser(Long id) {
        return adminUserMapper.deleteUser(id);
    }

    @Override
    public int updateUserStatus(Long id, Integer status) {
        AdminUserDO adminUserDO = validateUserExists(id);
        adminUserDO.setDeleted(status);
        return adminUserMapper.updateUserStatus(adminUserDO);
    }

    @Override
    public int updateUserPassword(Long id, String password) {
        AdminUserDO adminUserDO = validateUserExists(id);
        adminUserDO.setPassword(encodePassword(password));
        return adminUserMapper.updateUserPassword(adminUserDO);
    }

    @VisibleForTesting
    AdminUserDO validateUserExists(Long id) {
        if (id == null) {
            return null;
        }
        AdminUserDO user = adminUserMapper.selectById(id);
        if (user == null) {
            throw new ServiceException(USER_NOT_EXISTS);
        }
        return user;
    }

    public boolean isPasswordMatch(String rawPassword, String encodedPassword) {
        return passwordEncoder.matches(rawPassword, encodedPassword);
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


}
