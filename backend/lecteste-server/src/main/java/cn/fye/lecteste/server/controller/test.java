package cn.fye.lecteste.server.controller;

import cn.fye.lecteste.framework.common.exception.enums.GlobalErrorCodeConstants;
import cn.fye.lecteste.framework.common.pojo.CommonResult;
import cn.fye.lecteste.server.vo.UserVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class test {
    /**
     * 查询用户列表
     *
     * @return 用户列表
     */

    @GetMapping("")
    public CommonResult<?> list() {
        // 查询列表
        List<UserVO> result = new ArrayList<>();
        result.add(new UserVO().setId(1).setUsername("yudaoyuanma"));
        result.add(new UserVO().setId(2).setUsername("woshiyutou"));
        result.add(new UserVO().setId(3).setUsername("chifanshuijiao"));
        // 返回列表
        return CommonResult.error(GlobalErrorCodeConstants.BAD_REQUEST);
    }
}
