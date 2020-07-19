package allOopsrelatedConcepts;

public class Inheritance 
{
	static	int a = 10;
		static int b = 20;		
		
		public static void main(String[] args)
		{
			B11 b1 = new B11();
			b1.m1();
			
		}}
		
		
  class B11 extends Inheritance
	{
	static int c = 20;
	public static void m1()
	{
		System.out.println("value of a="+ a);
		System.out.println("value of b="+ b);
		System.out.println("value of c="+ c);
		
		
	}
	
	}
 
	

		
	

