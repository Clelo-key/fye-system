package cn.fye.cloud.module.system.dal.dataobject.user;

import cn.fye.clould.framework.common.enums.CommonStatusEnum;
import cn.fye.clould.framework.common.enums.SexEnum;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDateTime;
import java.util.Set;

/**
 * @Author: Fly
 * @CreateTime: 2025-03-16
 * @Version: 1.0
 */

@Data
@TableName("sys_user")
public class AdminUserDO {
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
     * 加密后的密码
     *
     * 因为目前使用 {@link BCryptPasswordEncoder} 加密器，所以无需自己处理 salt 盐
     */
    private String password;
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
    /**
     * 创建时间
     * */
    private LocalDateTime createTime;
    /**
     * 更新时间
     * */
    private LocalDateTime updateTime;
}
