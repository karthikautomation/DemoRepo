package com.gmail.qa.pages;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gmail.qa.base.Testbase;

public class Loginpage extends Testbase 
{

	
	

	@FindBy(name="identifier")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//span[@class='RveJvd snByac']")
	WebElement nextbtn;
	
	public Loginpage() throws IOException {
		PageFactory.initElements(driver,this);
	}
	
	public String ValidateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public void Login(String mail,String mailpassword)
	{
		new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(username)).sendKeys(mail);
		nextbtn.click();
		new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(password)).sendKeys(mailpassword);
		nextbtn.click();
		
	}
	
	
	
}
