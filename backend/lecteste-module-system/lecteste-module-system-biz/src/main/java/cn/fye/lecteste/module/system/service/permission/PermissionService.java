package cn.fye.lecteste.module.system.service.permission;

/**
 * @Author: Fly
 * @CreateTime: 2024-12-11
 * @Version: 1.0
 */
public interface PermissionService {
    /**
     * 判断是否有权限，任一一个即可
     *
     * @param userId 用户编号
     * @param permissions 权限
     * @return 是否
     */
    boolean hasAnyPermissions(Long userId, String... permissions);

    /**
     * 判断是否有角色，任一一个即可
     *
     * @param userId 用户编号
     * @param roles 角色数组
     * @return 是否
     */
    boolean hasAnyRoles(Long userId, String... roles);
}
