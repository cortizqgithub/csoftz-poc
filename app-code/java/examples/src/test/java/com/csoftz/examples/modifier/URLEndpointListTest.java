/*----------------------------------------------------------------------------*/
/* Source File:   URLENDPOINTLISTTEST.JAVA                                    */
/* Copyright (c), 2021 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 May.01/2021  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.examples.modifier;

import static com.csoftz.examples.modifier.GlobalConstants.HTTP_MODIFY_OTHER_URL;
import static com.csoftz.examples.modifier.URLEndPointModifierUtils.configureEndpointsToSet;
import static com.csoftz.examples.modifier.URLEndPointModifierUtils.createEndPointURLModifier;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class URLEndpointListTest {

    private static final String ENDPOINT_URL_FIELD = "url";
    private URLEndpointModifier urlEndpointModifier;
    private List<Endpoint> endpointConfig;

    @BeforeEach
    void setUp() {
        endpointConfig = configureEndpointsToSet();
    }

    @Test
    void givenEndpointListThenModifyURLAsExpected() {
        urlEndpointModifier = createEndPointURLModifier(true);
        endpointConfig.forEach(urlEndpointModifier::modifyURLFor);

        assertThat(endpointConfig)
            .extracting(ENDPOINT_URL_FIELD)
            .hasSize(2)
            .contains(HTTP_MODIFY_OTHER_URL);
    }

    @Test
    void givenEndpointListThenKeepDeclaredURLExpected() {
        urlEndpointModifier = createEndPointURLModifier(false);
        endpointConfig.forEach(urlEndpointModifier::modifyURLFor);

        assertThat(endpointConfig)
            .extracting(ENDPOINT_URL_FIELD)
            .hasSize(2)
            .doesNotContain(HTTP_MODIFY_OTHER_URL);
    }
}