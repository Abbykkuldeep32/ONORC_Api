package com.example.dealer.util;

import java.util.Base64;
import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;

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
    
    public boolean validateToken(String token) {
        try {
            Jwts.parser()
                .setSigningKey(SECRET_KEY)
                .parseClaimsJws(token); // If parsing succeeds, the token is valid.
            return true;
        } catch (SignatureException | MalformedJwtException e) {
            System.out.println("Invalid JWT signature or format");
        } catch (ExpiredJwtException e) {
            System.out.println("JWT token is expired");
        } catch (Exception e) {
            System.out.println("Invalid JWT token");
        }
        return false;
    }
    
 // Extract claims from the token
    public String extractMobileNo(String token) {
        Claims claims = Jwts.parser()
                .setSigningKey(SECRET_KEY)
                .parseClaimsJws(token)
                .getBody();
        return claims.getSubject(); // The 'sub' claim contains the mobile number
    }
    
    public long getExpirationInSeconds(String token) {
        Claims claims = Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody();
        Date expirationDate = claims.getExpiration();
        return (expirationDate.getTime() - System.currentTimeMillis()) / 1000;
    }
}
