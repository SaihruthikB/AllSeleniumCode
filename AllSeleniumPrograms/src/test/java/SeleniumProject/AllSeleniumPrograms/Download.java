package SeleniumProject.AllSeleniumPrograms;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.junit.jupiter.api.Test;
//import static org.hamcrest.Matchers.*;
//import static org.hamcrest.MatcherAssert.assertThat; 


public class Download {

	WebDriver d1;
	File Folder;
	
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void Setup()
	{
		Folder = new File(UUID.randomUUID().toString());
		Folder.mkdir();
		
		//to use some chrome options like when we click on downlaod 
		//link it will disable popups if the are displayed 
		ChromeOptions options = new ChromeOptions();
		//steps to do that
		Map<String, Object> refer = new HashMap<String, Object>();
		refer.put("profile.defult_content_settings.popups", 0);
		refer.put("download.default_directory", Folder.getAbsoluteFile());
		
		options.setExperimentalOption("prefs", refer);
		DesiredCapabilities Dc = new DesiredCapabilities().chrome();
		Dc.setCapability(ChromeOptions.CAPABILITY, options);
		
		d1 = new ChromeDriver(Dc);
	}
	@Test
	public void test() throws InterruptedException
	{
		d1.get("http://the-internet.herokuapp.com/download");
		d1.findElement(By.xpath("//a[text()='1586253767811593248781387534348.jpg']")).click();
		Thread.sleep(2000);
		
	}
	@AfterMethod
	public void closeMethod()
	{
		d1.quit();
		for(File file:Folder.listFiles())
		{
			file.delete();
		}
	}
}
