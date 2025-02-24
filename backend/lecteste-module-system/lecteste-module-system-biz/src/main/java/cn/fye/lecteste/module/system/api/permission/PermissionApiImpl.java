package cn.fye.lecteste.module.system.api.permission;

import cn.fye.lecteste.module.system.service.permission.PermissionService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @Author: Fly
 * @CreateTime: 2024-12-11
 * @Version: 1.0
 */
@Service
public class PermissionApiImpl implements PermissionApi {

    @Resource
    private PermissionService permissionService;

    @Override
    public boolean hasAnyPermissions(Long userId, String... permissions) {
        return false;
    }

    @Override
    public boolean hasAnyRoles(Long userId, String... roles) {
        return permissionService.hasAnyRoles(userId, roles);
    }
}
