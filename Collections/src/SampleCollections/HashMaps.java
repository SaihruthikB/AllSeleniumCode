package SampleCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps {
	
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("hruthik", "24");
		map.put("offcie", "youngsoft");
		System.out.println(map.get("hruthik"));
		//Set<String> s1=map.keySet();
		for(Map.Entry<String, String> entry: map.entrySet())
		{
			String key =entry.getKey();
			String value=entry.getValue();
			
			System.out.println("key= "+key+ ",value= "+value);
		}
		
	}

}
