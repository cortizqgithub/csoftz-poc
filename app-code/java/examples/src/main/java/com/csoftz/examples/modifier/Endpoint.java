/*----------------------------------------------------------------------------*/
/* Source File:   ENDPOINT.JAVA                                               */
/* Copyright (c), 2021 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 May.01/2021  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.examples.modifier;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Defines and Endpoint model.
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.0, May.01/2021
 * @since 16 (JDK), May.01/2021
 */
@Data
@AllArgsConstructor
public class Endpoint {
    private String name;
    private String url;
}
