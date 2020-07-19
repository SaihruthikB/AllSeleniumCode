package handlingWindowPopup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WindowPopupHandling {
	
	WebDriver d1;
	
	@Test
	public void Testmethod1() throws InterruptedException
	{
	   d1 =new ChromeDriver();
	   d1.get("https://trunk.h2hdigitalrx.com/drx/");
	   //Thread.sleep(2000);
	  WebElement e1= d1.findElement(By.xpath("//div[@id='leftNavigation']/table/tbody/tr/td/table/tbody/tr[2]/td/img"));
	  Actions a1  = new Actions(d1);
	  a1.moveToElement(e1).click().build().perform();
	 Set<String> handle=d1.getWindowHandles();
	 Iterator<String>it=handle.iterator();
	 String parentwindow=it.next();
	 System.out.println("ParentWindow Id ="+parentwindow);
	 String ChildWindow=it.next(); 
	 System.out.println("ParentWindow Id ="+ChildWindow);
	 d1.switchTo().window(ChildWindow);
	 //Thread.sleep(4000);
	 d1.findElement(By.xpath("//input[@name='userId']")).sendKeys("saihruthik");
	 d1.findElement(By.xpath("//input[@name='password']")).sendKeys("Pass@123");
	 d1.findElement(By.xpath("//span[text()='Login']")).click();
	 Thread.sleep(2000);
	 d1.findElement(By.xpath("//input[@name='lastName']")).sendKeys("a");
	 d1.findElement(By.xpath("(//span[@id='paddedLinks']/a)[1]")).click();
	 Thread.sleep(2000);
	 d1.findElement(By.xpath("(//div[@id='scrollableTBodyThreeFourth']/table/tbody/tr/td/span[@id='dataLinks']/a)[2]")).click();
	 
	  
	  
	   
	}

}
