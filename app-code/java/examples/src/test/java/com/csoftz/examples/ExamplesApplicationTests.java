/*----------------------------------------------------------------------------*/
/* Source File:   EXAMPLESAPPLICATIONTESTS.JAVA                               */
/* Copyright (c), 2021 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 May.01/2021  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.examples;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

/**
 * Spring Boot Context test.
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.0, May.01/2021
 * @since 16 (JDK), May.01/2021
 */
@SpringBootTest
class ExamplesApplicationTests {

    @Autowired
    private ApplicationContext appContext;

    /**
     * Load Spring Boot App to validate it is well configured.
     */
    @Test
    void contextLoads() {
        assertThat(appContext).isNotNull();
    }

}
