package googleDynamicSearch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicSearch {

	public static WebDriver d1;
	
	public static void main(String[] args) {
		
		d1 = new ChromeDriver();
		d1.get("https://www.google.com/");
		d1.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("testing");
		List<WebElement> list=d1.findElements(By.xpath("//div[@class='aajZCb']//ul[@role='listbox']//li/descendant::div[@class='sbl1']//span"));
		System.out.println(list.size());
		
		
		for(int i =0; i<list.size();i++)
		{
			System.out.println(list.get(i));
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().equals("kits for coronavirus in india"));
			list.get(i).click();
		}
		
		
		
	}
}
