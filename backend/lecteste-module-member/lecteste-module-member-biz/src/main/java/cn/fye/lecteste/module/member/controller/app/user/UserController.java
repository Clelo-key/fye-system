package cn.fye.lecteste.module.member.controller.app.user;

import cn.fye.lecteste.framework.common.pojo.CommonResult;
import cn.fye.lecteste.module.member.dal.dataobject.user.MemberUserDO;
import cn.fye.lecteste.module.member.service.user.MemberUserService;
import jakarta.annotation.Resource;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


import static cn.fye.lecteste.framework.common.pojo.CommonResult.success;
/**
 * @author FYE
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    MemberUserService memberUserService;

    /**
     * @apiNote Spring Security权限测试
     */
    @GetMapping("/normal")
    @PreAuthorize("@ss.hasRole('MEMBER')")
    public CommonResult<MemberUserDO> getNormalUserByMobile(@RequestParam("mobile") String mobile){
        MemberUserDO userByMobile = memberUserService.getUserByMobile(mobile);
        userByMobile.setMobile("I Am NORMAL");
        return success(userByMobile);
    }
    /**
     * @apiNote Spring Security权限测试
     */
    @GetMapping("/admin")
    @PreAuthorize("@ss.hasRole('ADMIN')")
    public CommonResult<MemberUserDO> getAdminUserByMobile(@RequestParam("mobile") String mobile){
        MemberUserDO userByMobile = memberUserService.getUserByMobile(mobile);
//        userByMobile.setMobile("I Am ADMIN");
        return success(userByMobile);
    }
}
