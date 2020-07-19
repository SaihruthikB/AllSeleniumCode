package SeleniumProject.AllSeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PizzaHutTask {
	static WebDriver d1 = new ChromeDriver();
	
	public static void main(String[] args) throws InterruptedException {
		
		//d1.manage().window().maximize();
		//d1.manage().deleteAllCookies();
		d1.get("https://crm.pizzahut.co.in/index.php/feedback/delivery");
		//Thread.sleep(3000);
		//d1.findElement(By.className("absolute inset-0 flex-center")).click();
		//d1.findElement(By.xpath("(//span[@class='absolute inset-0 flex-center'])[2]")).click();
		d1.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		Select s1 = new Select(d1.findElement(By.id("city_id")));
		s1.selectByVisibleText("Indore");
		Select city1 = new Select(d1.findElement(By.xpath("//select[@id='storeId']")));
		city1.selectByIndex(1);
		d1.findElement(By.xpath("//input[@type='submit']")).click();
		Year();
		Month();
		d1.findElement(By.xpath("//table[contains(@class,'calendar')]/tbody/tr[5]/td[2]")).click();
		d1.findElement(By.xpath("//input[@id='math_captcha']")).sendKeys(Capcha());
		
		
		
		
		
		
	}
	
	public static void Year()
	{
		d1.findElement(By.xpath("//input[@name='date_of_visit']")).click();
		String Expected = "2017";
		int ExpectedYear=Integer.parseInt(Expected);
		String actualYear=d1.findElement(By.xpath("//span[text()='2020']")).getText();
		int ActualYear=Integer.parseInt(actualYear);
		while(true)
		{
		if(ExpectedYear==ActualYear)
		{
			break;
		}
		else
		{
			d1.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			ActualYear=Integer.parseInt(d1.findElement(By.xpath("//span[contains(@class,'year')]")).getText());
		}
		}
	
	}
	public static void Month()
	{
		String ExpectedMonth = "April";
		String Actual = d1.findElement(By.xpath("//span[contains(@class,'month')]")).getText();
		while(true)
		{
			if (ExpectedMonth.equals(Actual))
			{
				break;
			}
			else
			{
				d1.findElement(By.xpath("(//span[contains(@class,'triangle')])[1]")).click();
				Actual = d1.findElement(By.xpath("//span[contains(@class,'month')]")).getText();
			}
		}
	}
	
	public static String Capcha()
	{
		String captch=d1.findElement(By.xpath("//font[@style='font-size:13px;color:green']")).getText();
		String[] parts=captch.split(" ");
		String part1 = parts[0];
		String part2 = parts[1];
		String part3= parts[2];
		int answer=0;
		if(part2.equals("+"))
		{
			answer=Integer.parseInt(part1)+Integer.parseInt(part3);
		}
		
		if(part2.equals("-"))
		{
			answer=Integer.parseInt(part1)-Integer.parseInt(part3);
		}
		

		if(part2.equals("*"))
		{
			answer=Integer.parseInt(part1)-Integer.parseInt(part3);
		}
		if(part2.equals("%"))
		{
			answer=Integer.parseInt(part1)%Integer.parseInt(part3);
		}
		
		return answer + "";
	}
	

}
