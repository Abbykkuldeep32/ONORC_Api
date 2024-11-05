package com.example.dealer.service;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class TokenBlacklistService {
	
	@Autowired
    private RedisTemplate<String, String> redisTemplate;

    // Method to add a token to the blacklist
    public void blacklistToken(String token, long expirationInSeconds) {
        redisTemplate.opsForValue().set(token, "blacklisted", expirationInSeconds, TimeUnit.SECONDS);
    }

    // Method to check if a token is blacklisted
    public boolean isTokenBlacklisted(String token) {
        return redisTemplate.hasKey(token);
    }
}
