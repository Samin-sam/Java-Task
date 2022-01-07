public class Sample
{
	public static void main(String arg[])
	{
		
		Address address = new Address(7, "SampleName", 8) ; // creating an object of an Address type
		/*
		Focus on the following line. During creation of an Employee object also we are
		passing an object which is Address type and created above. 
		*/
		Employee e = new Employee("abc", 20, "abc@gmail.com", "579-677", "Lecturer", address) ;
		
		System.out.println("Here is Employee's info:") ;
		e.display() ;
	}
}