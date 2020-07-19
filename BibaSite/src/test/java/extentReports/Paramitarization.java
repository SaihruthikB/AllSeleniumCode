package extentReports;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Paramitarization {
	
	@Test(dataProvider="getData")
	
	public void Username(String emaild, String Password)
	{
		System.out.println("username"+ emaild + "Passwrod" + Password);
	}


	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		data[1][0] = "hruthik.bolly@gmail.com";
		data[1][1] = "9666463576";
		return data;
	}
}
