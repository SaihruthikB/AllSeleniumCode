package samplePrograms;

public class WordReserve {
	
	static String name = "reverse a string";
	
	public static void main(String[] args) {
		
	 String output= name(name);
	 
	 System.out.println(output);
		 
		
	}
	
	
	public static String name(String Myname)
	{
		
		String reverse = "";
		String[] array = name.split("");
		
		for(String item : array)
		{
			reverse = item + reverse ;
		}
		
		return reverse;
	}
	
	 
}
