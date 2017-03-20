/*----------------------------------------------------------------------------*/
/* Source File:   DEMOAPPLICATION.JAVA                                        */
/* Description:   JWT Demo App Entry point                                    */
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

package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * JWT Demo App Entry point
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, Mar.16/2017
 * @since 1.8 (JDK), Mar.16/2017
 */
@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class DemoApplication {

    /**
     * Spring Boot Application entry point
     * @param args Command line arguments.
     */
    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
    }

    /**
     * Get a response
     * @return Content in HTML.
     */
    @RequestMapping("/")
    String hello() {

        return "hello world";
    }
}
