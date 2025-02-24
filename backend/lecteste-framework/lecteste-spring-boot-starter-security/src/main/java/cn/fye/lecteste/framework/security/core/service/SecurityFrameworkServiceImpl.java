package cn.fye.lecteste.framework.security.core.service;

import cn.fye.lecteste.module.system.api.permission.PermissionApi;
import lombok.AllArgsConstructor;

import static cn.fye.lecteste.framework.security.core.util.SecurityFrameworkUtils.getLoginUserId;

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
        Long userId = getLoginUserId();
        if (userId == null) {
            return false;
        }
        return permissionApi.hasAnyRoles(userId,role);
    }

    @Override
    public boolean hasAnyRoles(String... roles) {
        return true;
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
