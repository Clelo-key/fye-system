package cn.fye.cloud.module.system.dal.dataobject.user.vo;

import cn.fye.clould.framework.common.enums.CommonStatusEnum;
import cn.fye.clould.framework.common.validation.InEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @Author: Fly
 * @CreateTime: 2025-04-14
 * @Version: 1.0
 */
@Schema(description = "管理后台 - 用户伪删除 Request VO")
@Data
public class UserUpdateStatusReqVO {
    @Schema(description = "用户编号", requiredMode = Schema.RequiredMode.REQUIRED, example = "2")
    @NotNull(message = "角色编号不能为空")
    private Long id;

    @Schema(description = "状态，见 CommonStatusEnum 枚举", requiredMode = Schema.RequiredMode.REQUIRED, example = "1")
    @NotNull(message = "状态不能为空")
    @InEnum(value = CommonStatusEnum.class, message = "修改状态必须是 {value}")
    private Integer status;
}
