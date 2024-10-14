package cn.fye.lecteste.module.pay.controller.app.order;


import cn.fye.lecteste.framework.common.pojo.CommonResult;
import cn.fye.lecteste.module.member.api.user.MemberUserApi;
import cn.fye.lecteste.module.member.api.user.dto.MemberUserRespDTO;
import cn.fye.lecteste.module.pay.dal.dataobject.order.PayOrderDO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;


import static cn.fye.lecteste.framework.common.pojo.CommonResult.success;

/**
 * @author FYE
 */
@RestController
@RequestMapping("/pay/order")
public class AppPayOrderController {

    @Resource
    MemberUserApi memberUserApi;

    @GetMapping("")
    public CommonResult<?> getOrder(@RequestParam("mobile") String mobile) {
        PayOrderDO payOrderDO = new PayOrderDO();
        payOrderDO.setId(10010L);
        MemberUserRespDTO user = memberUserApi.getUserByMobile(mobile);
        payOrderDO.setUserNackName(user.getNickname());
        return success(payOrderDO);
    }
}
