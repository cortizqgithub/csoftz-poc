/*----------------------------------------------------------------------------*/
/* Source File:   DEMOAPPLICATIONTESTS.JAVA                                   */
/* Description:   JWT Demo App Entry point (Test)                             */
/* Author:        Carlos Adolfo Ortiz Quirós (COQ)                            */
/* Date:          Mar.16/2017                                                 */
/* Last Modified: Mar.20/2017                                                 */
/* Version:       1.2                                                         */
/* Copyright (c), 2017 CSoftZ                                                 */
/*----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------
 History
 Mar.16/2017 COQ  File created.
 -----------------------------------------------------------------------------*/

package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * JWT Demo App Entry point (Test)  
 * 
 * @since 1.8 (JDK), Mar.16/2017
 * @author Carlos Adolfo Ortiz Quirós (COQ)
 * @version 1.2, Mar.20/2017
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	/**
	 * Ensures that Spring Boot loads correctly.
	 */
	@Test
	public void contextLoads() {
	}
}