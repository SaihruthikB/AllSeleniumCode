package smapleMethods;

public class MethodWithArguments {
	
	public static void main(String[] args) {
		
		Method("Hruthik", 95);
		Method("Hruthik1", 35);
		
	}
	
	public static void Method(String student, int scroe)
	
	{
		String grade;
		if (scroe>=90 && scroe<=100 )
		{
			grade = "A";
		}
		else if (scroe>=80 && scroe<=90 )
		{
			grade = "B";
		}
		else if (scroe>=70 && scroe<=80 )
		{
			grade = "C";
		}
		else if (scroe>=70 && scroe<=80 )
		{
			grade = "D";
			
		}
		else
		{
			grade = "E";
		}
		
		System.out.println("persentage of "+student+" is"+grade);
	}

}


