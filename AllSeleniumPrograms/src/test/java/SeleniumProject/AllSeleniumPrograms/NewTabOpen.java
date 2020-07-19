package SeleniumProject.AllSeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabOpen {
	
	public static void main(String[] args) {
		
		WebDriver d1 = new ChromeDriver();
		d1.get("https://www.google.com");
		d1.switchTo().newWindow(WindowType.TAB);
	}

}
