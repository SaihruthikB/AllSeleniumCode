package examples;

public class VerifyCharectoers {
	
	public static void main(String[] args) {
		
		String str = "saihruthikbolly from bhuwhawarpet";
		
		int count = 0;
		
		for(int i=0;i<=str.length()-1; i++)
		{
			if (str.charAt(i)=='h')
			{
				count++;
				System.out.println("Count of B char ="+count+ "times");
			}
		}
				
				
		
	}

}
