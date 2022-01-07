public class Student
{
	private String name ;
	private String id ;
	private static final int totalNumberOfStudents ;
	private final int midBonusMark = 2 ; /*you can initialize any final field/attribue during 
	declaration or in the constructor. But remember once you have initilized either way you can
	not change it later*/
	
	
	public Student(String name, String id)
	{
		this.name = name ;
		this.id = id ;
	}
	
	static
	{
		totalNumberOfStudents = 40 ; 
		/*Since the totalNumberOfStudents is static so we have to initialize it within
		static block. Remember static block not static method. In the slide that was a subconcius 
		mistake, static block will be further discussed in upcoming classes*/
	}
	void display()
	{
		System.out.println("Name: "+name) ;
		System.out.println("ID: "+id) ;
		System.out.println("Total Number of Students: "+totalNumberOfStudents) ;
		System.out.println("Bonus mark is : "+midBonusMark) ;
	}
	
	public static void main(String arg[])
	{
		Student s = new Student("abc", "14-44") ;
		s.display() ;
	}
}