package com.drx.qa.allPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.drx.qa.BaseClass.BaseClass;

public class SendToPhramacyFinalPage extends BaseClass{
	
	@FindBy(xpath="(//span[@id='paddedLinks'])[4]/a")
	WebElement sendtoPhramacyButton;
	
	@FindBy(xpath="//div[@id='scrollableTBodyOneFourth']/table/tbody/tr/td/span")
	WebElement successpopup;
	
	@FindBy(xpath="//a/span[@class='closeLink']")
	WebElement closelink;
	
	public SendToPhramacyFinalPage()
	{
		PageFactory.initElements(d1, this);
	}
	
	public NewRXPage clickOnPhramacybutton() throws InterruptedException
	{
		sendtoPhramacyButton.click();
		Thread.sleep(2000);
		return new NewRXPage();
	}
	
	public void successpopup()
	{
		String s1=successpopup.getText();
		System.out.println(s1);
		
		
	}
	
	public void closelink()
	{
		closelink.click();
	}
	
	

}
