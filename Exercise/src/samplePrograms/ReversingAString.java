package samplePrograms;

public class ReversingAString {
	static String  input = "this is a test String";

	public static void main(String[] args)
	{
		
		
		
		String output = reverse(input);
		System.out.println(output);

	}

	private static String reverse(String input) {
		
		
		
		String reverse = "";
		
		if(input.isEmpty() || input== null)
		{
			System.out.println();
		}
		
		
		if (input.length()<=1)
		{
			reverse = input;
		}
		else
		{
			String[] array = input.split("\\s+");
			
			for(String item : array)
			{
				reverse = item +" "+ reverse;
			
		}
		}
		return reverse.trim();
	}

}
