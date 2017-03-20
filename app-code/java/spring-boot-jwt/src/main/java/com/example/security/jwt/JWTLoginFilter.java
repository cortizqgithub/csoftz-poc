/*----------------------------------------------------------------------------*/
/* Source File:   JWTLOGINFILTER.JAVA                                         */
/* Description:   Login JWT filtering                                         */
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
package com.example.security.jwt;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Login JWT filtering
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.2, Mar.21/2017
 * @since 1.8 (JDK), Mar.16/2017
 */
public class JWTLoginFilter extends AbstractAuthenticationProcessingFilter {

    private TokenAuthenticationService tokenAuthenticationService;

    /**
     * Constructor with parameters
     *
     * @param url                   The url to validate
     * @param authenticationManager The authentication manager.
     */
    public JWTLoginFilter(String url, AuthenticationManager authenticationManager) {
        super(new AntPathRequestMatcher(url));
        setAuthenticationManager(authenticationManager);
        tokenAuthenticationService = new TokenAuthenticationService();
    }


    /**
     * Tries to make an authentication.
     *
     * @param httpServletRequest  Handles HTTP Servlet Request
     * @param httpServletResponse Handles HTTP Servlet Response
     * @return Authentication object
     * @throws AuthenticationException Handles Authentication Exception
     * @throws IOException             Handles IO Exception
     * @throws ServletException        Handls Servlet Exception
     */
    @Override
    public Authentication attemptAuthentication(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws AuthenticationException, IOException, ServletException {
        AccountCredentials credentials = new ObjectMapper().readValue(httpServletRequest.getInputStream(), AccountCredentials.class);
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(credentials.getUsername(), credentials.getPassword());
        return getAuthenticationManager().authenticate(token);
    }

    /**
     * Registers a successfull authentication TOKEN.
     *
     * @param request        Handles the HTTP Servlet Request
     * @param response       Handles the HTTP Servlet Response
     * @param chain          Handles chaining
     * @param authentication Gets a reference for the authentication service.
     * @throws IOException      I/O Exception
     * @throws ServletException Servlet Excdption
     */
    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authentication)
            throws IOException, ServletException {
        String name = authentication.getName();
        tokenAuthenticationService.addAuthentication(response, name);
    }
}