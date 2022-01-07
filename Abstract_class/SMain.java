public class SMain{
	public static void main(String arg[ ])
	{
	
		Shape s;// s is refference variable of Shape class
		
		s = new Rectangle(6,6) ; // s is holding the refference of Recatangle class
		s.calculateArea() ;
		
		Rectangle r = new Rectangle(4,4) ;
		r.calculateArea() ;


	}

}