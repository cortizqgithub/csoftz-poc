/*----------------------------------------------------------------------------*/
/* Source File:   HELLOCONTROLLERTEST.JAVA                                    */
/* Copyright (c), 2021 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 May.29/2021  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.antora.example.api.controller.integration;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.csoftz.antora.example.api.controller.HelloController;

/**
 * REST Api for Hello end-points (tests).
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, May.29/2021
 * @since 16 (JDK), May.29/2021
 */
@ExtendWith(SpringExtension.class)
@WebFluxTest(HelloController.class)
class HelloControllerTest {
    private static final String ENV_LATEST = "LATEST";
    private static final String ENV_STAGE = "STAGE";
    private static final String MSG_SAY_HELLO_LATEST = "Say Hello in the [LATEST] NICE eh.";
    private static final String MSG_SAY_HELLO_STAGE_WITH_PARAM = "Say Hello in the [STAGE] NICE eh. With parameter t=[pepito]";
    private static final String URL_HELLO_SAY_ENV = "/api/v1/hello/say/{env}";
    private static final String URL_EXTRACT_USER = "/api/v1/hello/extract/user";
    private static final String QUERY_PARAM_T_PEPITO = "t=pepito";
    private static final String QUESTION_MARK = "?";

    @Autowired
    private WebTestClient webTestClient;

    @Test
    void shouldReturnSayHelloWithLatest() {
        this.webTestClient.get()
            .uri(URL_HELLO_SAY_ENV, ENV_LATEST)
            .exchange()
            .expectStatus()
            .isOk()
            .expectBody(String.class)
            .isEqualTo(MSG_SAY_HELLO_LATEST);
    }

    @Test
    void shouldReturnSayHelloWithStageAndParamTSet() {
        this.webTestClient.get()
            .uri(URL_HELLO_SAY_ENV + QUESTION_MARK + QUERY_PARAM_T_PEPITO, ENV_STAGE)
            .exchange()
            .expectStatus()
            .isOk()
            .expectBody(String.class)
            .isEqualTo(MSG_SAY_HELLO_STAGE_WITH_PARAM);
    }

    @Test
    void shouldReturnUser() {
        this.webTestClient.get()
            .uri(URL_EXTRACT_USER)
            .accept(MediaType.APPLICATION_JSON)
            .exchange()
            .expectStatus().isOk()
            .expectBody()
            .jsonPath("$.name").isEqualTo("User")
            .jsonPath("$.surname").isEqualTo("Name");
    }
}