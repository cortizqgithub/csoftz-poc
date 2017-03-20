package com.csoftz.spring.boot.tdd.integration;

import org.junit.Test;

import static com.jayway.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;

public class EchoIT {
    @Test
    public void firstEchoTest() {
        get("/echo/hello")
                .then()
                .assertThat()
                .body("message", equalTo("hello"));
    }
}
