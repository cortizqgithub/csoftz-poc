/*----------------------------------------------------------------------------*/
/* Source File:   URLENDPOINTMODIFIERUTILS.JAVA                               */
/* Copyright (c), 2021 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 May.01/2021  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.examples.modifier;

import static com.csoftz.examples.modifier.GlobalConstants.ENDPOINT_TEST;
import static com.csoftz.examples.modifier.GlobalConstants.ENDPOINT_TEST_ONE;
import static com.csoftz.examples.modifier.GlobalConstants.ENDPOINT_TEST_TWO;
import static com.csoftz.examples.modifier.GlobalConstants.ENDPOINT_TEST_USER_TOKEN;
import static com.csoftz.examples.modifier.GlobalConstants.HTTP_MODIFY_INFO_URL;
import static com.csoftz.examples.modifier.GlobalConstants.HTTP_MODIFY_OTHER_URL;
import static com.csoftz.examples.modifier.GlobalConstants.HTTP_TEST_ONE;
import static com.csoftz.examples.modifier.GlobalConstants.HTTP_TEST_TWO;

import java.util.List;
import java.util.Map;

/**
 * Registers a map of possible endpoint names to override URLs for {@link Endpoint}
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.0, May.01/2021
 * @since 16 (JDK), May.01/2021
 */
public class URLEndPointModifierUtils {

    /**
     * Configure the URLEndpointModifier instance responsible of modifying URL Endpoint.
     *
     * @param enableModifyURL True if execute logic set to modify endpoint URL.
     * @return Instance to Endpoint Modify URL service.
     * @see URLEndpointModifier
     */
    public static URLEndpointModifier createEndPointURLModifier(boolean enableModifyURL) {
        return new URLEndpointModifier(enableModifyURL,
            Map.of(
                ENDPOINT_TEST, HTTP_MODIFY_INFO_URL,
                ENDPOINT_TEST_USER_TOKEN, HTTP_MODIFY_INFO_URL,
                ENDPOINT_TEST_ONE, HTTP_MODIFY_OTHER_URL,
                ENDPOINT_TEST_TWO, HTTP_MODIFY_OTHER_URL)
        );
    }

    /**
     * Configures a list of endpoints that uses the service.
     *
     * @return A list of {@link Endpoint}
     */
    public static List<Endpoint> configureEndpointsToSet() {
        return List.of(
            new Endpoint(ENDPOINT_TEST_ONE, HTTP_TEST_ONE),
            new Endpoint(ENDPOINT_TEST_TWO, HTTP_TEST_TWO)
        );
    }
}
