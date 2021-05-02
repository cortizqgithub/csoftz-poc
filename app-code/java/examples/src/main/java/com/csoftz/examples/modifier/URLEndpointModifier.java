/*----------------------------------------------------------------------------*/
/* Source File:   URLENDPOINTMODIFIER.JAVA                                    */
/* Copyright (c), 2021 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 May.01/2021  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.examples.modifier;

import java.util.Map;

import lombok.AllArgsConstructor;

/**
 * Registers a map of possible endpoint names to override URLs for {@link Endpoint}
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.0, May.01/2021
 * @since 16 (JDK), May.01/2021
 */
@AllArgsConstructor
public class URLEndpointModifier {

    private final boolean enableModifyURL;
    private final Map<String, String> urlMap;

    public void modifyURLFor(Endpoint endpoint) {
        if (enableModifyURL) {
            String urlToModify = this.urlMap.get(endpoint.getName());
            if (urlToModify != null) {
                endpoint.setUrl(urlToModify);
            }
        }
    }
}
