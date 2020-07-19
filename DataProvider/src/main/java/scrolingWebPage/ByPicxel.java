package scrolingWebPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByPicxel {
  public static WebDriver d1;

	public static void main(String[] args) {
		d1 = new ChromeDriver();
		d1.get("https://www.guru99.com/scroll-up-down-selenium-webdriver.html");
		JavascriptExecutor js = (JavascriptExecutor) d1;
		// js.executeScript("window.scrollBy(0,1000)");
		//js.executeScript("window.scrollBy(0,1000)");

		WebElement e1=d1.findElement(By.xpath("//strong[text()='Script Description']"));
		js.executeScript("arguments[0].scrollIntoView()", e1);

	}
}
