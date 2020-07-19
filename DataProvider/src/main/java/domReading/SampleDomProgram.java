package domReading;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleDomProgram {
	
	public static WebDriver d1;
	
	@Test
	public static void Sample()
	{
		d1 = new ChromeDriver();
		d1.get("https://www.facebook.com/sai.hruthick12");
		d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)d1;
		js.executeScript("document.getElementByName(\"email\").value='123456'");
		
	}

}
