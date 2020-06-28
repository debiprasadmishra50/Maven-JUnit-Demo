package com.devi.maven.mavendemo;

import org.junit.Assert;
import org.junit.Test;

public class AppTest    
{
	@Test
    public void givenANameWhenHelloIsCalledThenReturnHelloName()
    {
    	App app = new App();
    	String result = app.hello("Debi");
    	Assert.assertNotNull(result);
    	Assert.assertEquals("Hello Debi", result); //(expected , returned_value)
    	
    	
    }
}
//If its green Test is pass, if its red, Test is fail
//Will fail for return of null value in App.java
