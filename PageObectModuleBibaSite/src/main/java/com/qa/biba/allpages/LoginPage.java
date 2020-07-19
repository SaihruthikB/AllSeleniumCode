package com.qa.biba.allpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.biba.Baseclass.Blassclass;

public class LoginPage extends Blassclass{
	
	@FindBy(xpath ="//input[@placeholder='Email Address *']")
	WebElement emailidTextfiled;
	@FindBy(xpath ="//input[@placeholder='Password *']")
	WebElement passwordfiled;
	@FindBy(xpath ="(//input[@type='submit'])[3]")
	WebElement submitbutton;
	
	//
	
	public  LoginPage()
	{
		PageFactory.initElements(d1, this);
	}
	
	//action
	public void userdetails(String username, String password)
	{
		emailidTextfiled.sendKeys(username);
		passwordfiled.sendKeys(password);	
	}
	public HomePage submitbutton()
	{
		submitbutton.click();
		return new HomePage();
	}


}
