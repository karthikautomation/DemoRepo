package com.gmail.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.opc.PackageProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testbase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public Testbase() throws IOException
	{
		
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("C:/selenium test cases/Gmailtest/src/main/java/com/gmail/qa/config/config.properties");
			prop.load(ip);
			
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
			
		}
		
		
	}
	
	public static void initialization()
	{
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geck\\geckodriver.exe");
		driver=new FirefoxDriver();
		System.out.println(prop.getProperty("url"));
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		
	}

}
