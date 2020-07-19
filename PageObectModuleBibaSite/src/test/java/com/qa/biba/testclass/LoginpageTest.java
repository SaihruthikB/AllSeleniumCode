package com.qa.biba.testclass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.biba.Baseclass.Blassclass;
import com.qa.biba.allpages.HomePage;
import com.qa.biba.allpages.LoginPage;

public class LoginpageTest extends Blassclass{
	
	public static HomePage home;
	public static LoginPage login;
	
	public LoginpageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void SetupMethod() throws InterruptedException
	{
		Innitalization();
		home= new HomePage();
		home.Signinbutton();
		login = new LoginPage();
		Thread.sleep(2000);
	}
	
	@Test
	public void EnterData() throws InterruptedException 
	{
		login.userdetails("hruthik.bolly@capillarytech.com", "1234567");
		login.submitbutton();
		Thread.sleep(3000);
	}
	
	@Test
	public void MixandMathces()
	{
		home.MixandMatches();
	}
	
	

}
