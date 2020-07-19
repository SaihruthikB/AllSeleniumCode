package com.drx.qa.allPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.drx.qa.BaseClass.BaseClass;

public class LoginPage extends BaseClass{
	
	//Object repositry
	
	@FindBy(xpath="//input[@name='userId']")
	WebElement logintextbutton;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordTextbutton;
	
	@FindBy(xpath="//span[text()='Login']")
	WebElement submitbutton;
	
	//initialiazation Method
	
	public LoginPage()
	{
		PageFactory.initElements(d1, this);//current page 
	}
	
	
	//Actions class
	
	public void enterUserdetails(String username, String password)
	{
		logintextbutton.sendKeys(username);
		passwordTextbutton.sendKeys(password);
		
	}
	
	public PatientSearchPage submitButton()
	{
		submitbutton.click();
		return new PatientSearchPage();
	}
	
	


}
