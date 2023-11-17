package com.example.demo.config;

import jakarta.servlet.http.HttpServlet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import java.security.Security;
import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableMethodSecurity
public class MySecurityConfigucation {
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService authentication() {

        PasswordEncoder encoder = passwordEncoder();
        List<UserDetails> users = new ArrayList<>();
        UserDetails user = User.builder()
                .username("Anvn")
                .password(encoder.encode("Anvn"))
                .build();
        users.add(user);

        UserDetails admin = User.builder()
                .username("admin")
                .password(encoder.encode("admin"))
                .roles("ADMIN")
                .build();
        users.add(admin);

        return new InMemoryUserDetailsManager(user,admin);
    }

    public SecurityFilterChain authorization(
            HttpSecurity httpSecurity
    ) throws Exception {
        httpSecurity
                .authorizeHttpRequests(req -> req
                        .requestMatchers("/admin/**").hasRole("ADMIN")
                        .anyRequest().permitAll()
                )
                .formLogin(login -> login
                        .loginPage("/login")
                        .loginProcessingUrl("/login")
                )


        ;
        return httpSecurity.build();
    }
}
