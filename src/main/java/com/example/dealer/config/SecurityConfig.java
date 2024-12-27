package com.example.dealer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import com.example.dealer.security.JwtAuthenticationFilter;

@Configuration
public class SecurityConfig {

    @Bean
    public JwtAuthenticationFilter jwtAuthenticationFilter() {
        return new JwtAuthenticationFilter(); // Your custom JWT filter
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    	 http
    	 .headers()
         .xssProtection()
         .and()
         .contentSecurityPolicy("default-src 'self'; script-src 'self'; object-src 'none';")
         .and()
         .frameOptions().sameOrigin()
         .and()
         .cors().and().csrf().disable()
         .authorizeHttpRequests()
             .requestMatchers("/public/**").permitAll()
             .requestMatchers("/api/v1/saledetail/generate-receipt/**").permitAll()
             .anyRequest().authenticated()
             .and()
    	 .addFilterBefore(jwtAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);
        return http.build();
    }
}
