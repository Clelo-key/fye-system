package cn.fye.lecteste.module.member.api.user.dto;

import lombok.Data;

/**
 * @author FYE
 */
@Data
public class MemberUserRespDTO {
    /**
     * 用户ID
     */
    private Long id;
    /**
     * 用户昵称
     */
    private String nickname;
    /**
     * 用户号码
     */
    private String mobile;

}
