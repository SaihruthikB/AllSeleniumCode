package allOopsrelatedConcepts;

public class Class_Objects {
	String name;
	int id;
	String Designation;
	
	public void employee(String name, int id, String Desigantion)
	{
		System.out.println("name ="+name);
		System.out.println("id ="+id);
		System.out.println("Desigantion ="+Desigantion);
	}
	
	public static void main(String[] args) {
		
		Class_Objects e1 = new Class_Objects();
		e1.employee("hruthik", 9303, "Testing");
		
	}
	
}
