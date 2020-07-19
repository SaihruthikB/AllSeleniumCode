package samplePrograms;

import java.util.Scanner;

public class UsingScannerClass {
	
	public static void main(String[] args) {
		
		Scanner c1 = new Scanner(System.in);
		System.out.println("Enter your text");
		String Orginal =c1.nextLine();
		
		while(Orginal.isEmpty() || Orginal==null)
			{
			   System.out.println("not allowed enter a valid thing");
			   Orginal = c1.nextLine();
			}
		c1.close();
		
		String output=name(Orginal);
		System.out.println(output);
	}
	
	private static String name(String OriginalCharecter)
	{
		String reverse = "";
		for(int i=OriginalCharecter.length()-1; i>=0; i--)
		{
			reverse = reverse + OriginalCharecter.charAt(i);
		}
		return reverse;
	}

}
