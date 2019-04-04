package com.gmail.qa.testcases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gmail.qa.base.Testbase;
import com.gmail.qa.pages.Loginpage;

public class LoginpageTest extends Testbase {
	
	Loginpage loginpage;

	public LoginpageTest() throws IOException 
	{
		super();
		
	}
    @BeforeMethod
	public void setup() throws IOException
	{
    	initialization();
    	loginpage=new Loginpage();
		
	}
    
    @Test
    public void LoginpageTitletest()
    {
    	String title=loginpage.ValidateLoginPageTitle();
    	Assert.assertEquals(title, "Sign in – Google accounts");
    }
    
    @Test
    public void Mailtest()
    {
    	loginpage.Login(prop.getProperty("mailid"),prop.getProperty("password"));
    	
    }
    
    @AfterMethod
    
    public void teardown()
  {
  	driver.quit();
    }
    
}
