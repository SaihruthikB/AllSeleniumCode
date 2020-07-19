package samplePackage;


import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d1 = new ChromeDriver();
		d1.get("https://www.google.com/");
		System.out.println(d1.getTitle());
		Thread.sleep(3000);
		d1.switchTo().newWindow(WindowType.TAB);
		d1.get("https://www.facebook.com");
		
		WebElement e1=d1.findElement(By.name("q"));
		File des=e1.getScreenshotAs(OutputType.FILE);
		
		
		
		
		
	}
}
