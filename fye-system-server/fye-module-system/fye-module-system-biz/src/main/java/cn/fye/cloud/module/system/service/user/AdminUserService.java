package cn.fye.cloud.module.system.service.user;

import cn.fye.cloud.module.system.dal.dataobject.user.AdminUserDO;
import org.springframework.stereotype.Service;

public interface AdminUserService {
    AdminUserDO getUserByUsername(String username);
}
