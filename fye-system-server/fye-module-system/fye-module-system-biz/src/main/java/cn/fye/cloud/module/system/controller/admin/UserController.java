package cn.fye.cloud.module.system.controller.admin;

import cn.fye.cloud.module.system.dal.dataobject.user.AdminUserDO;
import cn.fye.cloud.module.system.dal.dataobject.user.vo.UserRespVO;
import cn.fye.cloud.module.system.dal.dataobject.user.vo.UserSaveReqVO;
import cn.fye.cloud.module.system.dal.dataobject.user.vo.UserUpdatePasswordReqVO;
import cn.fye.cloud.module.system.dal.dataobject.user.vo.UserUpdateStatusReqVO;
import cn.fye.cloud.module.system.service.user.AdminUserService;
import cn.fye.clould.framework.common.pojo.CommonResult;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import static cn.fye.clould.framework.common.pojo.CommonResult.success;


/**
 * @Author: Fly
 * @CreateTime: 2025-03-12
 * @Version: 1.0
 */
@RestController
@Tag(name = "用户管理", description = "")
@RequestMapping("/user")
public class UserController {

    @Resource
    AdminUserService adminUserService;


    @GetMapping("/get")
    @Operation(summary = "获得用户详情")
    public CommonResult<UserRespVO> getUsers(@RequestParam("id") Long id) {
        return success(adminUserService.getUserById(id));
    }

    @PostMapping("/create")
    @Operation(summary = "新增用户")
    public CommonResult<Integer> createUser(@Valid @RequestBody UserSaveReqVO reqVO) {
        Integer id = adminUserService.createUser(reqVO);
        return success(id);
    }

    @DeleteMapping("/delete")
    @Operation(summary = "删除用户")
    @Parameter(name = "id", description = "编号", required = true, example = "1")
    public CommonResult<Integer> deleteUser(@RequestParam("id") Long id) {
        return success(adminUserService.deleteUser(id));
    }

    @PatchMapping("/update-status")
    @Operation(summary = "修改用户状态")
    public CommonResult<Integer> updateUserStatus(@Valid @RequestBody UserUpdateStatusReqVO reqVO) {
        return success(adminUserService.updateUserStatus(reqVO.getId(), reqVO.getStatus()));
    }

    @PatchMapping("/update-password")
    @Operation(summary = "修改用户密码")
    public CommonResult<Integer> updateUserPassword(@Valid @RequestBody UserUpdatePasswordReqVO reqVO) {
        return success(adminUserService.updateUserPassword(reqVO.getId(), reqVO.getPassword()));
    }

}
