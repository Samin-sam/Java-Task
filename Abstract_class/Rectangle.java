public class Rectangle extends Shape
{
	public Rectangle(int height, int width)
	{
		super(height, width) ;
		
	}
	public void calculateArea() /* Since Rectangle class is inheriting shape class so it has to 
									implement the abstract method. Remember if any subclass
									does not provide the implementation of any abstract method of
									its parent class then the subclass itself has to be abstract*/
	{
		int result = height * width  ;
		System.out.println("Result is: "+result) ;
	}	
}