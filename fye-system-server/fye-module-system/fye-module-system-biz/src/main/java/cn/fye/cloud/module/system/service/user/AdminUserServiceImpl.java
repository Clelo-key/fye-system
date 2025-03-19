package cn.fye.cloud.module.system.service.user;

import cn.fye.cloud.module.system.dal.dataobject.user.AdminUserDO;
import org.springframework.stereotype.Service;

/**
 * @Author: Fly
 * @CreateTime: 2025-03-16
 * @Version: 1.0
 */
@Service
public class AdminUserServiceImpl implements AdminUserService {
    /**
     * 通过用户名查询用户
     *
     * @param username 用户名
     * @return 用户对象信息
     */
    public AdminUserDO getUserByUsername(String username){
        AdminUserDO adminUserDO = new AdminUserDO();
        adminUserDO.setUsername(username);
        return adminUserDO;
    }

}
