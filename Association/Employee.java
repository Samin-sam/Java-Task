public class Employee
{
	private String name ;
	private int age ;
	private String email ;
	private String id ;
	private String designation ;
	private Address address ; // Association or HAS a relationship.

	public Employee()
	{
		
	}

	public Employee(String name, int age, String email, String id, String designation, Address address)
	{
		this.name = name ;
		this.age = age ;
		this.email = email ;
		this.id = id ;
		this.designation = designation ;
		this.address = address ; // this.address will be assigned by the object passed through the parameter
		
	}	
	
	
	public void display()
	{
		System.out.println("Name is "+name) ;
		System.out.println("Age is "+age) ;
		System.out.println("Email is "+email) ;
		System.out.println("ID is "+ id) ;
		System.out.println("Designation is "+ designation) ;
		System.out.println("Address details: House Name# "+address.houseName+", Road No# "+address.roadNo+", House No#"+address.houseNo  ) ;
	}
	
	
}