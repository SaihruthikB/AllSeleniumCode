package SeleniumProject.AllSeleniumPrograms;

public class WordsReverse {
	
	static String ActualString = "Bolly sai hruthik";
	
	public static void main(String[] args) {
	System.out.println(ReversingAString());
		
		//System.out.println(output);
		
		
	}
	
public static String ReversingAString()
{
	String reverse = "";
	String[] array=ActualString.split(" ");
	
	for(String item : array)
	{
		reverse = item+reverse;
	}
	
	return reverse;
	
}
}

