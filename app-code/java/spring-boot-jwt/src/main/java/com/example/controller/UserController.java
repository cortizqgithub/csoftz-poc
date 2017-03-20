/*----------------------------------------------------------------------------*/
/* Source File:   USERCONTROLLER.JAVA                                         */
/* Description:   Handles user operations                                     */
/* Author:        Carlos Adolfo Ortiz Quirós (COQ)                            */
/* Date:          Mar.16/2017                                                 */
/* Last Modified: Mar.16/2017                                                 */
/* Version:       1.1                                                         */
/* Copyright (c), 2017 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Mar.16/2017 COQ  File created.
 -----------------------------------------------------------------------------*/

package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Handles user operations 
 * 
 * @since 1.8 (JDK), Mar.16/2017
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Mar.16/2017
 *
 */
@RestController
public class UserController {

    /**
     * Return a list of users
     * @return String with users.
     */
    @RequestMapping("/users") /* Maps to all HTTP actions by default (GET,POST,..)*/
    @ResponseBody
    public String getUsers() {
        return "{\"users\":[{\"firstname\":\"Richard\", \"lastname\":\"Feynman\"}," +
                "{\"firstname\":\"Marie\",\"lastname\":\"Curie\"}]}";
    }

}