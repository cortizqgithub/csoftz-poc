/*----------------------------------------------------------------------------*/
/* Source File:   URLENDPOINTLIST.JAVA                                        */
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
import static com.csoftz.examples.modifier.GlobalConstants.ENDPOINT_TEST_THREE;
import static com.csoftz.examples.modifier.GlobalConstants.ENDPOINT_TEST_TWO;
import static com.csoftz.examples.modifier.GlobalConstants.ENDPOINT_TEST_USER_TOKEN;
import static com.csoftz.examples.modifier.GlobalConstants.HTTP_TEST;
import static com.csoftz.examples.modifier.GlobalConstants.HTTP_TEST_ONE;
import static com.csoftz.examples.modifier.GlobalConstants.HTTP_TEST_THREE;
import static com.csoftz.examples.modifier.GlobalConstants.HTTP_TEST_TWO;
import static com.csoftz.examples.modifier.GlobalConstants.HTTP_TEST_USER_TOKEN;

import java.util.List;

/**
 * Sets a list of endpoints to use in the system.
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.0, May.01/2021
 * @since 16 (JDK), May.01/2021
 */
public final class URLEndpointList {
    private static final List<Endpoint> endpoints;

    static {
        endpoints = List.of(
            new Endpoint(ENDPOINT_TEST_ONE, HTTP_TEST_ONE),
            new Endpoint(ENDPOINT_TEST_TWO, HTTP_TEST_TWO),
            new Endpoint(ENDPOINT_TEST_THREE, HTTP_TEST_THREE),
            new Endpoint(ENDPOINT_TEST_USER_TOKEN, HTTP_TEST_USER_TOKEN),
            new Endpoint(ENDPOINT_TEST, HTTP_TEST),
            new Endpoint(ENDPOINT_TEST_MOD, null)
        );
    }

    /**
     * Hide default constructor as this is an utility class.
     */
    private URLEndpointList() {
        // Make sonarlint compliant.
    }

    /**
     * Locate the instance for endpoint from list.
     *
     * @param endpointName Key name for endpoint.
     * @return Null if instance not found or {@link Endpoint}
     */
    public static Endpoint retrieveEndpointFor(String endpointName) {
        return endpoints.stream()
            .filter(endpoint -> endpoint.getName().equals(endpointName))
            .findFirst()
            .orElse(null);
    }

    /**
     * Get the full list of endpoints registered.
     *
     * @return List of Endpoints.
     */
    public static List<Endpoint> retrieveAllEndpoints() {
        return endpoints;
    }
}
