package SeleniumProject.AllSeleniumPrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsAndPopups {
	
	public static void main(String[] args) {
		
		WebDriver d1 = new ChromeDriver();
		d1.get("http://demo.guru99.com/test/delete_customer.php");
		d1.findElement(By.name("cusid")).sendKeys("hruthik");
		d1.findElement(By.name("submit")).click();
		
		//Switching to Alert Using Switch to Alert Method
		Alert a1 =d1.switchTo().alert();
		String AlertMessage = d1.switchTo().alert().getText();
		System.out.println("Alert Message Is = "+ AlertMessage);
		a1.accept();
		
	
		
		
	}
	

}
