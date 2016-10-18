package com.email;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.email.controller.HomeController;

public class AppTest {
	
	@Test    
    public void testApp() {
		HomeController hc = new HomeController();
        String result = hc.home();
        assertEquals( result, "Emailer Program Running!");
    } 
}
