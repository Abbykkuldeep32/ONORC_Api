package com.example.dealer.security;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import com.example.dealer.service.TokenBlacklistService;
import com.example.dealer.util.JwtUtil;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JwtAuthenticationFilter extends OncePerRequestFilter{

	private final JwtUtil jwtUtil = new JwtUtil();

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
    	String path = request.getRequestURI();
    	
    	if (path.startsWith("/public/")) {
            filterChain.doFilter(request, response);
            return;
        }
    	
        String authorizationHeader = request.getHeader("Authorization");

        String mobileNo = null;
        String token = null;

        // Extract token
        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
            token = authorizationHeader.substring(7);
            if (jwtUtil.validateToken(token)) {
                mobileNo = jwtUtil.extractMobileNo(token);
                UsernamePasswordAuthenticationToken authentication =
                        new UsernamePasswordAuthenticationToken(mobileNo, null, null);
                authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                SecurityContextHolder.getContext().setAuthentication(authentication);
                System.out.println("Valid token for mobile number: " + mobileNo);
            } else {
                System.out.println("Invalid token");
            }
        }

        filterChain.doFilter(request, response);
    }
}
