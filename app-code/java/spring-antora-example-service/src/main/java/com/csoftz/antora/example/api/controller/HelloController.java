/*----------------------------------------------------------------------------*/
/* Source File:   HELLOCONTROLLER.JAVA                                        */
/* Copyright (c), 2021 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 May.29/2021  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.antora.example.api.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.csoftz.antora.example.domain.User;

/**
 * REST Api for Hello end-points.
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, May.29/2021
 * @since 16 (JDK), May.29/2021
 */
@RestController
@RequestMapping("api/v1/hello")
public class HelloController {

    private static final String USER_NAME = "User";
    private static final String USER_SURNAME = "Name";
    private static final String MSG_HELLO_SAY = "Say Hello in the [";
    private static final String MSG_HELLO_NICE = "] NICE eh.";
    private static final String MSG_HELLO_T_PARAM = " With parameter t=[";
    private static final String SQUARE_BRACKET_RIGHT = "]";

    /**
     * Gives a salutation with the parameters supplied.
     * GET /api/v1/hello/say/{env}
     * GET /api/v1/hello/say/{env}?t=text
     *
     * @param env a text to be used mimicking a computational Environment like LATEST, STAGE, LOAD, PROD, or any other text.
     * @param t   It is a query parameter in the HTML URL, if used it will be included in the response.
     * @return A text message with a given message using the parameters.
     */
    @GetMapping("say/{env}")
    public String helloWorld(@PathVariable String env,
                             @RequestParam(value = "t", required = false) String t) {
        var sb = new StringBuilder();
        sb.append(MSG_HELLO_SAY)
            .append(env)
            .append(MSG_HELLO_NICE);

        if (t != null) {
            sb.append(MSG_HELLO_T_PARAM)
                .append(t)
                .append(SQUARE_BRACKET_RIGHT);
        }
        return sb.toString();
    }

    /**
     * Extracts User information. Here only a fake User object is return. Always its
     * Id is different, but not his other data.
     * GET /api/v1/hello/extract/user
     *
     * @return An User object with his data.
     * @see User
     */
    @GetMapping("extract/user")
    public User retriveUser() {
        return new User(UUID.randomUUID().toString(), USER_NAME, USER_SURNAME);
    }
}
