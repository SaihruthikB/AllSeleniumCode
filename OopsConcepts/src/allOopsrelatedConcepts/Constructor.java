package allOopsrelatedConcepts;

public class Constructor {
	
	
	//Constructor are used to initialse the objects 
	// Constructor name should be same as class name 
	
	String name;
	int Rollno;
	String designation;
	
	
	public  Constructor(String n,String d, int R)
	{
		name = n;
		Rollno = R;
		designation = d;
		System.out.println("employeename "+ name+" ," + " designations = "+designation+ " Id "+Rollno);
	}

	public static void main(String[] args) {
		Constructor c1= new Constructor("hruthik", "testing", 9030);
		Constructor c2= new Constructor("hruthik1", "testing", 9032);
		
	}

}
