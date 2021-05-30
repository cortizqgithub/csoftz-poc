/*----------------------------------------------------------------------------*/
/* Source File:   SPRINGANTORAEXAMPLESERVICEAPPLICATION.JAVA                  */
/* Copyright (c), 2021 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 May.29/2021  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.antora.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point to the application.
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, May.29/2021
 * @since 16 (JDK), May.29/2021
 */
@SpringBootApplication
public class SpringAntoraExampleServiceApplication {

    /**
     * Main entry point to application.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringAntoraExampleServiceApplication.class, args);
    }

}
