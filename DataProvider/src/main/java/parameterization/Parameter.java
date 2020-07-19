package parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	
	@Test
	@Parameters({"url", "username"})
	public void parameter(String username, String Password)
	{
	System.out.println(username);
	System.out.println(Password);
	}

}
