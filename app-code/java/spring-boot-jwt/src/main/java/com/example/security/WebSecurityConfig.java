/*----------------------------------------------------------------------------*/
/* Source File:   WEBSECURITYCONFIG.JAVA                                      */
/* Description:   Spring Boot configuration                                   */
/* Author:        Carlos Adolfo Ortiz Quirós (COQ)                            */
/* Date:          Mar.16/2017                                                 */
/* Last Modified: Mar.21/2017                                                 */
/* Version:       1.2                                                         */
/* Copyright (c), 2017 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Mar.16/2017 COQ  File created.
 -----------------------------------------------------------------------------*/

package com.example.security;

import com.example.security.jwt.JWTAuthenticationFilter;
import com.example.security.jwt.JWTLoginFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * Spring Boot configuration
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.2, Mar.21/2017
 * @since 1.8 (JDK), Mar.16/2017
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    /**
     * Creates a configuration based in HttpSecurity object.
     *
     * @param http Information of the http request
     * @throws Exception Handles generic Exception.
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // disable caching
        http.headers().cacheControl();

        http.csrf().disable() // disable csrf for our requests.
                .authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers(HttpMethod.POST, "/login").permitAll()
                .anyRequest().authenticated()
                .and()
                // We filter the api/login requests
                .addFilterBefore(new JWTLoginFilter("/login", authenticationManager()), UsernamePasswordAuthenticationFilter.class)
                // And filter other requests to check the presence of JWT in header
                .addFilterBefore(new JWTAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);
    }

    /**
     * Configuration based in an AuthenticationManagerBuilder
     *
     * @param auth Info object for authentication.
     * @throws Exception Handles Generic Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        // Create a default account
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password("password")
                .roles("ADMIN");
    }
}
