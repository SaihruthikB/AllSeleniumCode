package SeleniumProject.AllSeleniumPrograms;

public class Table {
	
	public static void main(String[] args) {
		
		Table t1 = new Table();
		
		t1.Table20();
	}
	
	public  void Table20()
	{
		//int j = 11;
	    for(int i=1; i<=20; i++)
	    {
	    	for(int j=1; j<=10; j++)
	    {
	    	int tab= i * j;
	    	System.out.println(i + "x "+ j +"="+ tab);
	    }System.out.println("Table Completed");
	}

}}
