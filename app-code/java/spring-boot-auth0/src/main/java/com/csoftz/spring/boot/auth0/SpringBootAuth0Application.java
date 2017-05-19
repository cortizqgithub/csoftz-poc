/* Source File:   SPRINGBOOTAUTH0APPLICATION.JAVA                             */
/* Description:   JWT Auth0 Demo App Entry point                              */
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
package com.csoftz.spring.boot.auth0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * JWT Auth0 Demo App Entry point
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Mar.20/2017
 * @since 1.8 (JDK), Mar.20/2017
 */
@SpringBootApplication
public class SpringBootAuth0Application {

    /**
     * Spring Boot Application entry point
     * @param args Command line arguments.
     */
	public static void main(String[] args) {
	    SpringApplication.run(SpringBootAuth0Application.class, args);
	}
}
