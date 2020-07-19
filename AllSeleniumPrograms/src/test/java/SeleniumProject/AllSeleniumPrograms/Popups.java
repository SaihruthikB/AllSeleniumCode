package SeleniumProject.AllSeleniumPrograms;
import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Popups {
	
	public static void main(String[] args) throws InterruptedException {
	
	WebDriver d1 = new ChromeDriver();
	d1.get("https://www.biba.in/");
	//d1.manage().window().maximize();
	//d1.manage().deleteAllCookies();
	d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	WebElement e1=d1.findElement(By.xpath("(//span[@class='main_navbtn_m'])[2]"));
	Actions a1 = new Actions(d1);
	a1.moveToElement(e1).build().perform();
	Thread.sleep(3000);
	d1.findElement(By.xpath("(//div[@class='sub-menu-wrapper-top']/div/table/tbody/tr/td/dl/dd/ol/li/ol/li/a)[6]")).click();
	//a1.moveToElement(e2).build().perform();
	
	
	
	
	
	
	
	}
	
	

}
