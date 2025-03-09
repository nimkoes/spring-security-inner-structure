package io.github.nimkoes.ssis.config;

import io.github.nimkoes.ssis.filter.CustomGenericFilter;
import io.github.nimkoes.ssis.filter.CustomOnceFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.logout.LogoutFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth.anyRequest().permitAll())
                .addFilterAfter(new CustomGenericFilter(), LogoutFilter.class)
                .addFilterAfter(new CustomOnceFilter(), LogoutFilter.class);

        return http.build();
    }
}
