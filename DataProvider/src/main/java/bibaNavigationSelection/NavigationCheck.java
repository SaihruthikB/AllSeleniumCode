package bibaNavigationSelection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NavigationCheck {
	
	WebDriver d1;
	  
	
	@Test
	public void setBrowser() throws InterruptedException
	{
		d1 = new ChromeDriver();
		d1.get("https://www.biba.in/");
		d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement mix=d1.findElement(By.xpath("//span[contains(text(),'Mix & Match')]"));
		Actions a1 = new Actions(d1);
		a1.moveToElement(mix).build().perform();
		Thread.sleep(2000);
		WebElement dresses=d1.findElement(By.xpath("(//div[@class='sub-menu-wrapper-top']/div/table/tbody/tr/td/dl[@class='section']/dd/ol/li/ol/li/a)[2]"));
		a1.moveToElement(dresses).click(dresses).build().perform();
		
		String s1=dresses.getAttribute("href");
		System.out.println(s1);
		
		
		
	}

}
