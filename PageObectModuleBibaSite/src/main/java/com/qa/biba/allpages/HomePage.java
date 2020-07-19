package com.qa.biba.allpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.biba.Baseclass.Blassclass;

public class HomePage extends Blassclass {

	// pagepactory

	@FindBy(xpath = "//a[@class='loginlnk signin loginimg']")
	WebElement signbutton;

	@FindBy(xpath = "//a[@class='loginlnk RegistrationPopUpLink newuserimg']")
	WebElement Registartionbutton;
	
	@FindBy(xpath="//span[text()='Mix & Match']")
	WebElement mixmatches;

	// innitialzation

	public HomePage() {
		PageFactory.initElements(d1, this);
	}

	// Actions
	
	public  LoginPage Signinbutton()
	{
		signbutton.click();
		return new LoginPage();
	}
	
	public  Registration Registartionbutton()
	{
		Registartionbutton.click();	
		return new Registration();
		
	}
	public PlpPage MixandMatches()
	{
		mixmatches.click();
		return new PlpPage();
	}

}
