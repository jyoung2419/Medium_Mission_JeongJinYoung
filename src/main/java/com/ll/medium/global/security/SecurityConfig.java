package com.ll.medium.global.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    public SecurityConfig() {
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests((authorizeRequests) -> {
            ((ExpressionUrlAuthorizationConfigurer.AuthorizedUrl)authorizeRequests.requestMatchers(new String[]{"/**"})).permitAll();
        }).headers((headers) -> {
            headers.frameOptions((frameOptions) -> {
                frameOptions.sameOrigin();
            });
        }).csrf((csrf) -> {
            csrf.ignoringRequestMatchers(new String[]{"/h2-console/**"});
        });
        return (SecurityFilterChain)http.build();
    }
}