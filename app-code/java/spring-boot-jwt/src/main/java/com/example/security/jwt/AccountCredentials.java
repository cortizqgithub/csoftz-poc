/*----------------------------------------------------------------------------*/
/* Source File:   ACCOUNTCREDENTIALS.JAVA                                     */
/* Description:   Information for authenticated user                          */
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

/**
 * Information for authenticated user
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.2, Mar.20/2017
 * @since 1.8 (JDK), Mar.16/2017
 */
public class AccountCredentials {
    private String username;
    private String password;

    /**
     * Gets the user name
     *
     * @return user name
     */

    public String getUsername() {

        return username;
    }

    /**
     * Sets the user name
     *
     * @param username Info to set
     */
    public void setUsername(String username) {

        this.username = username;
    }

    /**
     * Get the password
     *
     * @return Stored password info
     */
    public String getPassword() {

        return password;
    }

    /**
     * Sets the password
     *
     * @param password Info to set
     */
    public void setPassword(String password) {

        this.password = password;
    }
}
