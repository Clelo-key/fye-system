package com.hmdp.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;

public class JwtUtils {
    private  static String SignKey="03iqj37wcgysghome73jsncfkcjr39emdvi7";
    private  static Long Expire=50000000L;

    public static String genJwtPassword(HashMap<String, Object> claims){
        // signWith：设置签名算法以及密钥,claims:设置自定义内容,expiration：设置令牌过期时间
        SecretKey key = Keys.hmacShaKeyFor(SignKey.getBytes(StandardCharsets.UTF_8)); // 通过密钥自动选择合适的算法，并返回对应的SecretKey对象
        String JwtPass = Jwts.builder().signWith(key)
                .claims(claims).expiration(new Date(System.currentTimeMillis() + 3600 * 1000)).compact();
        return JwtPass;
    }

    public static Claims getClaims(String JwtPass){
        SecretKey key = Keys.hmacShaKeyFor(SignKey.getBytes(StandardCharsets.UTF_8));// 通过密钥自动选择合适的算法，并返回对应的SecretKey对象
        Claims payload = Jwts.parser().verifyWith(key).build().parseSignedClaims(JwtPass).getPayload();
        return payload;
    }
}
