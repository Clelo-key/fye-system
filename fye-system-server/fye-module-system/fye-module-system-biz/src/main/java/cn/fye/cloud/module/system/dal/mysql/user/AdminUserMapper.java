package cn.fye.cloud.module.system.dal.mysql.user;

import cn.fye.cloud.framework.mybatis.core.query.FyeBaseWrapper;
import cn.fye.cloud.module.system.dal.dataobject.user.AdminUserDO;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface AdminUserMapper extends FyeBaseWrapper<AdminUserDO> {
    default AdminUserDO selectById(Long id) {
        return selectOne(new QueryWrapper<AdminUserDO>().eq("id", id));
    }

    default int createUser(AdminUserDO user) {
        return insert(user);
    }

    default int deleteUser(Long id) {
        return deleteById(id);
    }

    default int updateUserStatus(AdminUserDO user) {
        return update(new LambdaUpdateWrapper<AdminUserDO>()
                .set(AdminUserDO::getDeleted, user.getDeleted())
                .eq(AdminUserDO::getId, user.getId())
        );
    }

    default int updateUserPassword(AdminUserDO user) {
        return update(new UpdateWrapper<AdminUserDO>()
                .set("password", user.getPassword())
                .eq("id", user.getId())
        );
    }
}
