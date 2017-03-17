package com.example.security.jwt;

import org.springframework.security.core.Authentication;

/**
 * Created by carlos.ortiz on 17/03/2017.
 */
public class AuthenticatedUser implements Authentication {
    public AuthenticatedUser(String username) {
    }
}
