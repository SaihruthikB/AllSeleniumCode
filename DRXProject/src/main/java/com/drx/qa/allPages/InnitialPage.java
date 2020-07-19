package com.drx.qa.allPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.drx.qa.BaseClass.BaseClass;

public class InnitialPage extends BaseClass {

	// PageFactory
	@FindBy(xpath ="(//div[@id='leftNavigation']/img)[1]")
	WebElement loginImageButton;

	// initiisation method

	public void innitializationLoginPage() {
		PageFactory.initElements(d1, this);// currentPageElement
	}

	// action Page

	public LoginPage clickOnLoginImage()  {
		Actions a1 = new Actions(d1);
		a1.moveToElement(loginImageButton).pause(100).click().build().perform();
		a1.moveToElement(loginImageButton).click().build().perform();
		return new LoginPage();
	}

}
