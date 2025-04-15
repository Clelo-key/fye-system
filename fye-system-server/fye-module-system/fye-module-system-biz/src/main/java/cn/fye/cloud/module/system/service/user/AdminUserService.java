package cn.fye.cloud.module.system.service.user;

import cn.fye.cloud.module.system.dal.dataobject.user.AdminUserDO;
import cn.fye.cloud.module.system.dal.dataobject.user.vo.UserRespVO;
import cn.fye.cloud.module.system.dal.dataobject.user.vo.UserSaveReqVO;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Service;

public interface AdminUserService {
    UserRespVO getUserById(Long id);

    int createUser(UserSaveReqVO userSaveReqVO);

    int deleteUser(Long id);

    int updateUserStatus(Long id, Integer status);

    int updateUserPassword(Long id, String password);
}
