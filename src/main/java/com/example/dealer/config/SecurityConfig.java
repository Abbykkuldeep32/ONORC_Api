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
    	.headers(headers -> headers
                .defaultsDisabled() // Disable default headers if needed
                .cacheControl(cache -> cache.disable()) // Disable cache headers if needed
                .addHeaderWriter((request, response) -> 
                    response.setHeader("X-XSS-Protection", "1; mode=block") // Set custom header
                )
            .contentSecurityPolicy(csp -> csp
                .policyDirectives("default-src 'self'; script-src 'self'; object-src 'none'; img-src 'self'; style-src 'self';")
            )
            .httpStrictTransportSecurity(hsts -> hsts
                .includeSubDomains(true)
                .maxAgeInSeconds(31536000)
                .preload(true)
            )
            .frameOptions(frame -> frame.sameOrigin()) // Allow same-origin frames
        )
        .cors(cors -> cors.configurationSource(corsConfigurationSource()))
        .csrf(csrf -> csrf.disable()) // Disable CSRF for APIs
        .authorizeHttpRequests(auth -> auth
            .requestMatchers("/public/**").permitAll()
            .requestMatchers("/api/v1/saledetail/generate-receipt/**").permitAll()
            .requestMatchers("/api/v1/inspector/login").permitAll()
            .anyRequest().authenticated()
        )
        .addFilterBefore(jwtAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class); // Add JWT filter

    return http.build();
    }

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("http://103.25.130.105:9090"); // Allowed origin
        corsConfiguration.addAllowedMethod("*"); // Allow all HTTP methods
        //corsConfiguration.addAllowedHeader("*"); // Allow all headers (if necessary)
        corsConfiguration.setAllowCredentials(true); // Allow credentials (cookies, HTTP authentication)

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", corsConfiguration); // Apply globally
        return source;
    }

}
