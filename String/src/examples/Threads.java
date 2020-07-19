package examples;

class Myclass extends Thread	
{

	public void run() {
		{
			for(int i=0; i<10;i++)
			{
				System.out.println(Thread.currentThread().getId()+"Value of i" +i);
			}
		}
	}
	
}

public class Threads {
	public static void main(String[] args) {
		
		Myclass mc = new Myclass();
		mc.start();
		Myclass mc1 = new Myclass();
		mc1.start();
		
	}
	
	

}
