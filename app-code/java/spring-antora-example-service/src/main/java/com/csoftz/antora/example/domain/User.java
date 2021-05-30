/*----------------------------------------------------------------------------*/
/* Source File:   USER.JAVA                                                   */
/* Copyright (c), 2021 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 May.29/2021  COQ  File created.
 -----------------------------------------------------------------------------*/
package com.csoftz.antora.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Represents the information recorded for an User
 *
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.1, May.29/2021
 * @since 16 (JDK), May.29/2021
 */
@Data
@AllArgsConstructor
public class User {
    private String id;
    private String name;
    private String surname;
}
