/*package com.rendez.vous.rendezvous.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){
        UserDetails hassanfig = User.builder()
                .username("hassanfig")
                .password("{noop}hassanfig")
                .roles("admin")
                .build();
        UserDetails malika = User.builder()
                .username("malika")
                .password("{noop}hassanfig")
                .roles("manager")
                .build();
        UserDetails hasna = User.builder()
                .username("hasna")
                .password("{noop}hassanfig")
                .roles("employee")
                .build();

        return new InMemoryUserDetailsManager(hassanfig,malika,hasna);

    }

        sss@Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests(configurer ->
                configurer
                        .requestMatchers(HttpMethod.GET,"/api/users").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.GET,"/api/users/**").hasRole("MANAGER")
                        .requestMatchers(HttpMethod.POST,"/api/users").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.DELETE,"/api/users").hasRole("ADMIN")

                        .requestMatchers(HttpMethod.GET,"/api/rendezvous").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET,"/api/admin").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET,"/api/centres").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET,"/api/creneaux").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET,"/api/users").hasRole("ADMIN")
        )
    }




}
 */