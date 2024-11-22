package cn.fye.lecteste.module.member.controller.app.user.vo;

import cn.fye.lecteste.framework.common.validation.Mobile;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppAuthLoginReqVO {
    @NotEmpty(message = "手机号不能为空")
    @Mobile
    private String mobile;

    @NotEmpty(message = "密码不能为空")
    @Length(min = 4, max = 16, message = "密码长度为 4-16 位")
    private String password;

}
