package cn.fye.lecteste.module.pay.api.order;

import cn.fye.lecteste.module.pay.api.order.dto.PayOrderCreateReqDTO;
import cn.fye.lecteste.module.pay.api.order.dto.PayOrderRespDTO;

/**
 * @author FYE
 */
public interface PayOrderApi {
    /**
     * 创建支付订单
     *  @param reqDTO 创建请求
     *  @return 支付单编号
     * */
    Long createOrder(PayOrderCreateReqDTO reqDTO);

    /**
     * 获得支付订单
     * @param id 支付单编号
     * @return 支付单
     */
    PayOrderRespDTO getOrder(Long id);

}
