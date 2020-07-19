package SeleniumProject.AllSeleniumPrograms;

public class MaximumNumberInArry {
	
	public static void main(String[] args) {
		
		int array[] = {1, 25,200, 65, 47, 100};
		
		int max = array[0];
		
		for (int i =1;  i<array.length; i++)
		{
			if(array[i]>max)
				max = array[i];
		}
		
		System.out.println(max);
	}

}
