package cn.fye.lecteste.module.member.controller.app.auth;

import cn.fye.lecteste.framework.common.pojo.CommonResult;
import cn.fye.lecteste.module.member.controller.app.auth.vo.AppAuthLoginReqVO;
import cn.fye.lecteste.module.member.controller.app.auth.vo.AppAuthLoginRespVO;
import cn.fye.lecteste.module.member.service.auth.MemberAuthService;
import jakarta.annotation.Resource;
import jakarta.annotation.security.PermitAll;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static cn.fye.lecteste.framework.common.pojo.CommonResult.success;

/**
 * 用户 App-认证
 * */
@RestController
@RequestMapping("/member/auth")
@Validated
public class AppAuthController {
    @Resource
    private MemberAuthService authService;

    @PostMapping("/login")
    @PermitAll
    public CommonResult<AppAuthLoginRespVO> login(@RequestBody @Valid AppAuthLoginReqVO reqVO){
        return success(authService.login(reqVO));
    }
}
