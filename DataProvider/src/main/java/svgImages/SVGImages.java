package svgImages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGImages {
	
	static WebDriver d1;
	
	public static void main(String[] args) {
		d1 =new ChromeDriver();
		d1.get("https://www.flipkart.com/");
		
	List<WebElement> pathlist=d1.findElements(By.xpath("//*[name()='svg']//*[name()='g']//"
			+ "*[name()='path' and @class='_2BhAHa']"));
		for(WebElement e1 : pathlist)
		{
			String s1 = null;
			s1=e1.getAttribute("d");
			
			System.out.println(s1);
		}
		
		
		//CADARKI001.  7822994340.   TS7654789   //digitalRx / digitalRx test
	 //CADSVKA001, 4732992068, TS9876453
	// PA, CAATATA001 , 8470689695, YS3462345
	//NP, CANTRTP001,9200804828, YS8754678 
	//PNP, CANTPTP001, 1455989230, YS6545678 
	//P without ControS , CADTYTY001 , 6799397503, TY6567654,, CADTYTY001
    //************
	//CADTRTP001, 2172478986 , TS7542345 /imasys
		
		//CADTRPT001 phimsy
	//
		//shaheenumaira  -- kumar
	//
	
	}
	
}
