package cn.fye.lecteste.framework.security.core.service;

import cn.fye.lecteste.module.system.api.permission.PermissionApi;
import lombok.AllArgsConstructor;

/**
 * 默认的 {@link SecurityFrameworkService} 实现类
 *
 * @author 芋道源码
 */
@AllArgsConstructor
public class SecurityFrameworkServiceImpl implements SecurityFrameworkService {

    private final PermissionApi permissionApi;

    @Override
    public boolean hasPermission(String permission) {
        return false;
    }

    @Override
    public boolean hasAnyPermissions(String... permissions) {
        return false;
    }

    @Override
    public boolean hasRole(String role) {
        return false;
    }

    @Override
    public boolean hasAnyRoles(String... roles) {
        return false;
    }

    @Override
    public boolean hasScope(String scope) {
        return false;
    }

    @Override
    public boolean hasAnyScopes(String... scope) {
        return false;
    }
}
