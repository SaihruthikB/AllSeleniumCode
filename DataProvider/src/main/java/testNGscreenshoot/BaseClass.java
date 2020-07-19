package testNGscreenshoot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver d1;
	public static void InnitilizationMethod() {
		d1 = new ChromeDriver();
		d1.get("https://www.biba.in/");
		d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void TakeScreenShot(String MethodName) {

		File screenshot = ((TakesScreenshot) d1).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File("/Users/admin/Documents/workspace/D"
					+ "ataProvider/Screenshot/"+"Test Field_"+MethodName+"_"+"jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
