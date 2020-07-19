package testNGTopics;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//assertions are used to validate actaul and expected result:
//Asserts are of two typs 
//1. hard Asserts 
//2. Soft Assert

// Soft Assert are used run the test-cases even if one test-cases got failed 

//To create the soft assert we can use inbulit call assert

//SoftAssert assert = new SoftAssert();

public class Assertions {
	
	WebDriver d1;
	@Test
	public void test()
	{
		String s1 = "www.google.com";
		String s2 = "www.yahoo.com";
	SoftAssert soft = new SoftAssert();
	AssertJUnit.assertTrue("Falling the assertions because of fails",false);
	Assert.fail("forcfully failing the test-cases");
	AssertJUnit.assertEquals(s1, s2);
	
		
		ChromeDriver d1 = new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("");
		soft.assertAll();
		
		
		
		
		
	}
	
	
	
	

}
