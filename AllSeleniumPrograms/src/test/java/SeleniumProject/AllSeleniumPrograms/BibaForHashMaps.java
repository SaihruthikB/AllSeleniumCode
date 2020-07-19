package SeleniumProject.AllSeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BibaForHashMaps {

	static WebDriver d1;

	public static void main(String[] args) {

		d1 = new ChromeDriver();
		d1.get("https://www.biba.in/");
		String name = HashMaps.HashMapsMethod().get("username");
		String password = HashMaps.HashMapsMethod().get("password");

		// String parts[]=details.split("_");

		d1.findElement(By.xpath("//a[contains(@class,'signin')]")).click();
		d1.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_ctl01_Login1_UserName")).sendKeys(name);
		d1.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_ctl01_Login1_Password")).sendKeys(password);
		d1.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_ctl01_Login1_LoginImageButton")).click();

	}

}
