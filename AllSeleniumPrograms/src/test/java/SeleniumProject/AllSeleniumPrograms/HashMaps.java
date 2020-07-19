package SeleniumProject.AllSeleniumPrograms;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
	

//	public static Map<String, String> HashMapsMethod()
	
	public static void main(String[] args) {
		
		Map<String, String> userdetails = new HashMap<String, String>();
		
		//userdetails.put("usermanePassword", "hruthik.bolly@capillarytech.com_1234567");
		userdetails.put("username", "hruthik.bolly@capillarytech.com");
		userdetails.put("password", "1234567");
		
		
		
		for(Map.Entry e1: userdetails.entrySet())
		{
			System.out.println(e1.getKey()+ "" +e1.getValue());
		}
		
		
		//return userdetails;
	}

}
