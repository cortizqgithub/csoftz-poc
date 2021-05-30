/*----------------------------------------------------------------------------*/
/* Source File:   SPRINGANTORAEXAMPLESERVICEAPPLICATIONTESTS.JAVA             */
/* Copyright (c), 2021 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 May.29/2021  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.antora.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

/**
 * Spring Boot Context test.
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, May.29/2021
 * @since 16 (JDK), May.29/2021
 */
@SpringBootTest
class SpringAntoraExampleServiceApplicationTests {
    @Autowired
    private ApplicationContext appContext;

    @Test
    void contextLoads() {
        assertThat(appContext).isNotNull();
    }

}
