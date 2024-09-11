package com.hmdp;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;

@SpringBootTest
class HmDianPingApplicationTests {
    private final String secret = "9234567890121221456";
    @Test
    public void genJwtPassword(){
        HashMap<String, String> studentAccount = new HashMap<>();
        studentAccount.put("account","2024");
        studentAccount.put("password","123456");
        // signWith：设置签名算法以及密钥,claims:设置自定义内容,expiration：设置令牌过期时间
        SecretKey key = Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8)); // 通过密钥自动选择合适的算法，并返回对应的SecretKey对象
        String JwtPass = Jwts.builder().signWith(key)
                .claims(studentAccount).expiration(new Date(System.currentTimeMillis() + 3600 * 1000)).compact();
        System.out.println(JwtPass);
        GetJwt(JwtPass);

    }

    public void GetJwt(String Jwt) {
        SecretKey key = Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8));// 通过密钥自动选择合适的算法，并返回对应的SecretKey对象
        Claims payload = Jwts.parser().verifyWith(key).build().parseSignedClaims(Jwt).getPayload();
        System.out.println(payload);
    }
}
