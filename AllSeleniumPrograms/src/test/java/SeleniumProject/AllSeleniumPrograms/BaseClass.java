package SeleniumProject.AllSeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	//static WebDriver d1;
	
	public static void BaseClass1()
	{
		WebDriver d1 = new ChromeDriver();
		d1.manage().window().maximize();
		d1.get("");
		
		
	}
	

}
