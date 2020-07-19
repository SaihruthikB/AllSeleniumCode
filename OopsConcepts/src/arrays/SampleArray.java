package arrays;

public class SampleArray {

	public static void main(String[] args) {
		
		int a[]; // decelaration
		a= new int [5]; //Allocation of memeory
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		
		int b[] = new int[]{1, 2 ,3};
		
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		

	}

}
