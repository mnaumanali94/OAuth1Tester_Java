/*
 * OAuth1TesterLib
 *
 * This file was automatically generated by APIMATIC v2.0 on 07/11/2016
 */
package com.testwronguri.www.controllers;

import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.testwronguri.www.Configuration;
import com.testwronguri.www.APIException;
import com.testwronguri.www.APIHelper;
import com.testwronguri.www.controllers.APIController;
import com.testwronguri.www.testing.TestHelper;
import com.fasterxml.jackson.core.type.TypeReference;

public class APIControllerTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static APIController controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        controller = getClient().getClient();
        applyConfiguration();
    }

    /**
     * Tear down test class
     * @throws IOException
     */
    @AfterClass
    public static void tearDownClass() throws IOException {
        controller = null;
    }

    /**
     * Todo Add description for test testOAuth1Test
     * @throws Throwable
     */
    @Test
    public void testOAuth1Test() throws Throwable {

        // Set callback and perform API call
        String result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.getOAuth1Test();
        } catch(APIException e) {};

        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test whether the captured response is as we expected
        assertNotNull("Result does not exist", 
                result);

        assertEquals("Response body does not match exactly",
                "You've passed the test!", 
                TestHelper.convertStreamToString(httpResponse.getResponse().getRawBody()));
    }

}
