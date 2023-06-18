package com.cafe.system.JWT;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class JwtUtil {

    private String secret = "btechdays";

    public <T> T extractClaims(String token, Function<Claims,T> claimsResolver){
        final Claims claims =
    }

    public Claims extractAllClaims (String token){
        return Jwts.parser().setSigningKey(secret)
    }



}
