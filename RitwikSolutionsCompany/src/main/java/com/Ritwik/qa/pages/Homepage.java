package com.Ritwik.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Ritwik.qa.baseclass.TestBaseClass;

public class Homepage extends TestBaseClass{

	//page Factory or OR
	
	
	@FindBy(xpath ="//div[@id='cssmenu']/ul/li[2]")
	WebElement prodcuts;
	
	@FindBy(xpath ="//div[@id='cssmenu']/ul/li[3]")
	WebElement services;
	
	@FindBy(xpath="//a[@class='logo']")
	WebElement image;
	
	
	//innitalizing the page objects
	
	public Homepage() throws IOException {
		
		PageFactory.initElements(driver, this);
		
	}

	//Actions
	
	public String Gettitle()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public boolean validateimage()
	{
		boolean b1=image.isDisplayed();
		
	return b1;
	}
	
	public Cereers validteservice()
	{
		services.click();
		return new Cereers();
	}

}
