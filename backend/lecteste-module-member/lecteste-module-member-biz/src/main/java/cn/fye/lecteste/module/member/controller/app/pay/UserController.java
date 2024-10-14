package cn.fye.lecteste.module.member.controller.app.pay;

import cn.fye.lecteste.framework.common.pojo.CommonResult;
import cn.fye.lecteste.module.member.dal.dataobject.user.MemberUserDO;
import cn.fye.lecteste.module.member.service.user.MemberUserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import static cn.fye.lecteste.framework.common.pojo.CommonResult.success;
/**
 * @author FYE
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    MemberUserService memberUserService;

    @GetMapping("")
    public CommonResult<MemberUserDO> getMemberUserByMobile(@RequestParam("mobile") String mobile){
        return success(memberUserService.getUserByMobile(mobile));
    }
}
