package SeleniumProject.AllSeleniumPrograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {
	
	static WebDriver d1;
	
	public static void main(String[] args) throws IOException {
		
		 d1 = new ChromeDriver();
		 d1.get("https://trunk.h2hdigitalrx.com/drx");
		 TakeScreenShot1();
		
		
		
	}
	
	public static void TakeScreenShot1() throws IOException
	{
		//this will take screenshot using TakesScreenshot interface
		File file =((TakesScreenshot)d1).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("/Users/admin/Documents/workspace/AllSeleniumPrograms/src/test"
				+ "/java/SeleniumProject/AllSeleniumPrograms"+".jpg"));
		
	}

}
