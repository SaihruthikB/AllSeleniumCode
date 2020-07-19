package testNGTopics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AllTestAnnotations {
	
	@BeforeClass
	public void ClearedCache()
	{
		System.out.println("egdf");	
	}
	@Test
	public static void TestCase1()
	{
		System.out.println("First Method");	
	}
	
	@Test
	public static void TestCase2()
	{
		System.out.println("Second Method");	
	}
	
	@Test
	public static void TestCase3()
	{
		System.out.println("Third Method");	
	}

	@BeforeMethod
	public static void BorwserOpen()
	{
		System.out.println("Open the browser");
	}
	
	@AfterMethod
	public void ClosedBrowser()
	{
		System.out.println("Closed th browser");
	}
	
	@AfterClass
	public void Quit()
	{
		System.out.println("Quit");
	}

	
}
