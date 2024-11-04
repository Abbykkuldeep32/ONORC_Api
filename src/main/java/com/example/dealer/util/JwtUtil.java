package com.example.dealer.util;

import java.util.Base64;
import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtUtil {
	
	private static final String SECRET_KEY = Base64.getEncoder().encodeToString("U2FsdGVkX19Wnb+LwZBvphHje/JNlwqzR8dsZQ8a4R/kKqEjQ8bnpA==".getBytes());

    public String generateToken(String mobileNo) {
        return Jwts.builder()
                .setSubject(mobileNo)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10)) // 10 hours expiration
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();
    }
}
