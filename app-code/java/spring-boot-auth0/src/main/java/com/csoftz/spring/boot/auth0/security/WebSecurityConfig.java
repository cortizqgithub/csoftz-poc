/*----------------------------------------------------------------------------*/
/* Source File:   WEBSECURITYCONFIG.JAVA                                      */
/* Description:   JWT Auth0 Web Configuration                                 */
/* Author:        Carlos Adolfo Ortiz Quirós (COQ)                            */
/* Date:          Mar.20/2017                                                 */
/* Last Modified: Mar.20/2017                                                 */
/* Version:       1.1                                                         */
/* Copyright (c), 2017 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Mar.20/2017 COQ  File created.
 -----------------------------------------------------------------------------*/

package com.csoftz.spring.boot.auth0.security;

import com.auth0.spring.security.api.JwtWebSecurityConfigurer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * JWT Auth0 Web Configuration
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Mar.20/2017
 * @since 1.8 (JDK), Mar.20/2017
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Value("${auth0.audience}")
    private String audience;

    @Value("${auth0.issuer}")
    private String issuer;

    @Value("${auth0.secret}")
    private String secret;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/users").authenticated();

        JwtWebSecurityConfigurer
                .forHS256(audience, issuer, secret.getBytes())
                .configure(http);
    }
}