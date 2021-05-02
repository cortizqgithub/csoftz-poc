/*----------------------------------------------------------------------------*/
/* Source File:   URLENDPOINTMODIFIERTEST.JAVA                                */
/* Copyright (c), 2021 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 May.01/2021  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.examples.modifier;

import static com.csoftz.examples.modifier.GlobalConstants.ENDPOINT_TEST;
import static com.csoftz.examples.modifier.GlobalConstants.ENDPOINT_TEST_MOD;
import static com.csoftz.examples.modifier.GlobalConstants.ENDPOINT_TEST_ONE;
import static com.csoftz.examples.modifier.GlobalConstants.ENDPOINT_TEST_USER_TOKEN;
import static com.csoftz.examples.modifier.GlobalConstants.HTTP_MODIFY_INFO_URL;
import static com.csoftz.examples.modifier.GlobalConstants.HTTP_TEST_ONE;
import static com.csoftz.examples.modifier.URLEndPointModifierUtils.createEndPointURLModifier;
import static com.csoftz.examples.modifier.URLEndpointList.retrieveEndpointFor;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Test deck for possible endpoint names to override URLs for {@link Endpoint}
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.0, May.01/2021
 * @since 16 (JDK), May.01/2021
 */
class URLEndpointModifierTest {

    private URLEndpointModifier urlEndpointModifier;

    @Test
    void whenEndpointModifyIsSetToTrueAndTestUserTokenConfigUsedThenURLIsModified() {
        urlEndpointModifier = createEndPointURLModifier(true);
        Endpoint endpoint = retrieveEndpointFor(ENDPOINT_TEST_USER_TOKEN);
        urlEndpointModifier.modifyURLFor(endpoint);
        assertThat(endpoint.getUrl()).isEqualTo(HTTP_MODIFY_INFO_URL);
    }

    @Test
    void whenEndpointModifyISetToTrueAndTestEndpointconfiguredThenURLIsModified() {
        urlEndpointModifier = createEndPointURLModifier(true);
        Endpoint endpoint = retrieveEndpointFor(ENDPOINT_TEST);
        urlEndpointModifier.modifyURLFor(endpoint);
        assertThat(endpoint.getUrl()).isEqualTo(HTTP_MODIFY_INFO_URL);
    }

    @Test
    void whenEndpointModifyIsSetToTrueWithNoMapForTestModAndTestModIsConfiguredNoUrlIsModified() {
        urlEndpointModifier = createEndPointURLModifier(true);
        Endpoint endpoint = retrieveEndpointFor(ENDPOINT_TEST_MOD);
        urlEndpointModifier.modifyURLFor(endpoint);
        assertThat(endpoint.getUrl()).isNull();
    }

    @Test
    void whenEndpointModifyIsSetToFalseWithNoMapForTestModAndAnyEndpointconfigUsedThenNoUrlIsModified() {
        urlEndpointModifier = createEndPointURLModifier(false);
        Endpoint endpoint = retrieveEndpointFor(ENDPOINT_TEST_ONE);
        urlEndpointModifier.modifyURLFor(endpoint);
        assertThat(endpoint.getUrl()).isEqualTo(HTTP_TEST_ONE);
    }
}