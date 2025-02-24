package cn.fye.lecteste.module.member.dal.dataobject.user;

import cn.fye.lecteste.framework.common.enums.SexEnum;
import cn.fye.lecteste.framework.common.enums.CommonStatusEnum;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;


/**
 * @author FYE
 */
@TableName(value = "member_users", autoResultMap = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberUserDO {
    // ========== 账号信息 ==========
    /**
     * 用户ID
     */
    @TableId
    private Long id;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 加密后的密码
     *
     */
    private String password;
    /**
     * 帐号状态
     *
     * 枚举 {@link CommonStatusEnum}
     */
    private Integer status;
    /**
     * 登录 IP
     */
    private String loginIp;
    // ========== 基础信息 ==========
    /**
     * 用户昵称
     */
    private String nickname;
    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 真实名字
     */
    private String name;
    /**
     * 性别
     *
     * 枚举 {@link SexEnum}
     */
    private Integer sex;
    /**
     * 出生日期
     */
    private LocalDateTime birthday;
    /**
     * 所在地,学校Id等等。。。
     *
     */
    private Integer areaId;
    /**
     * 创建日期
     */
    private LocalDateTime createTime;
    /**
     * 修改日期
     */
    private LocalDateTime updateTime;

    // ========== 其它信息 ==========
}
