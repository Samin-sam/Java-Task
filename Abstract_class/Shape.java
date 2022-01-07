
public abstract class Shape // abstract class
{
	protected int height ;
	protected int width ;
	 
	public Shape(int height, int width)
	{
		this.height = height ;
		this.width = width ;
	}
	public void setHeight(int height)
	{
		this.height = height ;
	}
	public int getHeight()
	{
		return this.height;
	}
	public void setWidth(int width)
	{
		this.width = width ; 
	}
	public int getWidth()
	{
		return this.width;
	}
	
	abstract public void calculateArea() ; // abstract method
	

	
}