package com.qa.biba.testclass;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.biba.Baseclass.Blassclass;
import com.qa.biba.allpages.HomePage;

public class HomeTestClass extends Blassclass {
	
  static  HomePage home;
	
	
	public HomeTestClass()
	{
		super();
	}
	
	@BeforeTest
	public void SetupMethos()
	{
		Innitalization();
		home = new HomePage();
	}
	
	@Test
	public static void BibaLogintest()
	{
	   home.Signinbutton();
	}

}
