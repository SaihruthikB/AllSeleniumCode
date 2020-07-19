package SeleniumProject.AllSeleniumPrograms;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {

		WebDriver d1 = new ChromeDriver();
		d1.get("https://www.biba.in/mix-and-match?PageNo=2");
		d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// get the clooection of all the links and images
		// links
		List<WebElement> linkList = d1.findElements(By.tagName("a"));
		// images
		linkList.addAll(d1.findElements(By.tagName("img")));

		// System.out.println("Total links"+linkList);
		// active Elements
		List<WebElement> activeElemets = new ArrayList<WebElement>();
		// itaration to store active links in the Active list

		for (int i = 0; i < linkList.size(); i++) {
			if (linkList.get(i).getAttribute("href") != null
					&& (!linkList.get(i).getAttribute("href").contains("javascript"))
					&& (!linkList.get(i).getAttribute("href").contains("mailto:customercare@bibaindia.com"))) {
				activeElemets.add(linkList.get(i));
				// System.out.println(linkList.get(i).getAttribute("href"));
			}
		}

		// Get the size of active Links

		int TotalActiveElements = activeElemets.size();
		System.out.println("total Active Elements" + TotalActiveElements);

		// Now check the href as correct http connections or not using http
		// connection API
		for (int j = 0; j < activeElemets.size(); j++) {
			HttpURLConnection connection = (HttpURLConnection) new URL(activeElemets.get(j).getAttribute("href"))
					.openConnection();
			connection.connect();
			String Response = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activeElemets.get(j).getAttribute("href") + "" + Response);

		}

	}

}
