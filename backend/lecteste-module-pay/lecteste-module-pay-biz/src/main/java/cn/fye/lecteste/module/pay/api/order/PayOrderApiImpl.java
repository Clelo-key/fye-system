package cn.fye.lecteste.module.pay.api.order;

import cn.fye.lecteste.module.pay.api.order.dto.PayOrderCreateReqDTO;
import cn.fye.lecteste.module.pay.api.order.dto.PayOrderRespDTO;

/**
 * @author FYE
 */
public class PayOrderApiImpl implements PayOrderApi{

    @Override
    public Long createOrder(PayOrderCreateReqDTO reqDTO) {
        return null;
    }

    @Override
    public PayOrderRespDTO getOrder(Long id) {
        return new PayOrderRespDTO(10000L);
    }
}
