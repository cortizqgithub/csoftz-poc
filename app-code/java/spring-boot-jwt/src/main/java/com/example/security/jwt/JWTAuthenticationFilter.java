/*----------------------------------------------------------------------------*/
/* Source File:   JWTAUTHENTICATIONFILTER.JAVA                                */
/* Description:   Filter implementation for JWT Authentication                */
/* Author:        Carlos Adolfo Ortiz Quirós (COQ)                            */
/* Date:          Mar.16/2017                                                 */
/* Last Modified: Mar.20/2017                                                 */
/* Version:       1.2                                                         */
/* Copyright (c), 2017 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Mar.16/2017 COQ  File created.
 -----------------------------------------------------------------------------*/

package com.example.security.jwt;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Filter implementation for JWT Authentication
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.2, Mar.20/2017
 * @since 1.8 (JDK), Mar.16/2017
 */
public class JWTAuthenticationFilter extends GenericFilterBean {

    /**
     * Servlet filter mechanism action.
     * @param request Handles Servlet Request
     * @param response Handles Servlet Response
     * @param filterChain Chaining
     * @throws IOException Handles IO exception
     * @throws ServletException Handles Servlet Exception
     */
    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain filterChain)
            throws IOException, ServletException {
        Authentication authentication = TokenAuthenticationService
                .getAuthentication((HttpServletRequest) request);

        SecurityContextHolder.getContext()
                .setAuthentication(authentication);
        filterChain.doFilter(request, response);
    }
}
