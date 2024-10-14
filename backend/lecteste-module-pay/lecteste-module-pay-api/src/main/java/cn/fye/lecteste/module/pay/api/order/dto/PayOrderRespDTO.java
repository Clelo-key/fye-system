package cn.fye.lecteste.module.pay.api.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.management.ConstructorParameters;

/**
 * @author FYE
 */

@Data
@AllArgsConstructor
public class PayOrderRespDTO {
    /**
     * 订单编号，数据库自增
     */
    private Long id;
}
