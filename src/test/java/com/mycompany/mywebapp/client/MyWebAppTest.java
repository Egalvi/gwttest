package com.mycompany.mywebapp.client;

import com.google.gwt.junit.client.GWTTestCase;
import org.junit.Before;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class MyWebAppTest extends GWTTestCase {

    public void testOne() throws Exception {
        assertTrue(true);
    }

    @Override
    public String getModuleName() {
        return "com.mycompany.mywebapp.MyWebApp";
    }
}