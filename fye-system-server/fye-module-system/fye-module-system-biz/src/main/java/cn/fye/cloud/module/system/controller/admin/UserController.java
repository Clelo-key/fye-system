package cn.fye.cloud.module.system.controller.admin;

import cn.fye.cloud.module.system.dal.dataobject.user.AdminUserDO;
import cn.fye.cloud.module.system.service.user.AdminUserService;
import cn.fye.clould.framework.common.pojo.CommonResult;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author: Fly
 * @CreateTime: 2025-03-12
 * @Version: 1.0
 */
@RestController
@Tag(name = "用户管理",description = "")
@RequestMapping("/user")
public class UserController {

    @Resource
    AdminUserService adminUserService;
    @GetMapping("/get")
    public CommonResult<AdminUserDO> getUsers(@RequestParam("name") String name) {
        return CommonResult.success(adminUserService.getUserByUsername(name));
    }
}
