package cn.fye.cloud.module.system.dal.dataobject.user.vo;

import cn.fye.clould.framework.common.enums.CommonStatusEnum;
import cn.fye.clould.framework.common.enums.SexEnum;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;


/**
 * @Author: Fly
 * @CreateTime: 2025-04-14
 * @Version: 1.0
 */
@Data
@Schema(description = "管理后台 - 用户响应 Response VO")
public class UserRespVO {
    /**
     * 用户ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 用户账号
     */
    private String username;

    /**
     * 用户昵称
     */
    private String nickname;
    /**
     * 用户邮箱
     */
    private String email;
    /**
     * 用户号码
     */
    private String mobile;
    /**
     * 用户性别
     * 枚举类 {@link SexEnum}
     */
    private Integer sex;
    /**
     * 部门 ID
     */
    private Long deptId;
    /**
     * 用户头像
     */
    private String avatar;
    /**
     * 帐号状态
     * 枚举 {@link CommonStatusEnum}
     */
    private Integer deleted;

}
