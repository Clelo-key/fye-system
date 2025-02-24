package cn.fye.lecteste.module.system.service.permission;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.StrUtil;
import com.google.common.collect.Sets;
import org.springframework.stereotype.Service;

import java.util.Set;

import static com.baomidou.mybatisplus.core.toolkit.sql.SqlScriptUtils.convertSet;

/**
 * @Author: Fly
 * @CreateTime: 2024-12-11
 * @Version: 1.0
 */
@Service
public class PermissionServiceImpl implements PermissionService {
    @Override
    public boolean hasAnyPermissions(Long userId, String... permissions) {
        return false;
    }

    @Override
    public boolean hasAnyRoles(Long userId, String... roles) {
        // 如果为空，说明已经有权限
        if (ArrayUtil.isEmpty(roles)) {
            return true;
        }
        // 获得当前登录的角色。如果为空，说明没有权限
//        List<RoleDO> roleList = getEnableUserRoleListByUserIdFromCache(userId);
//        if (CollUtil.isEmpty(roleList)) {
//            return false;
//        }

        // 判断是否有角色
//        Set<String> userRoles = convertSet(roleList, RoleDO::getCode);
        if (userId==1L&& StrUtil.containsAny("ADMIN",roles)){
            return true;
        }
        System.out.println("PermissionServiceImpl"+userId);
        return false;
    }
}
