package cn.fye.lecteste.module.member.controller.app.auth.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 用户 App - Response Vo
 * */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppAuthLoginRespVO {
    private Long userId;

    private String accessToken;

    private String refreshToken;

    private LocalDateTime expiresTime;

}
