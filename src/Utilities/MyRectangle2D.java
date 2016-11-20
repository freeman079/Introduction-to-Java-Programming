package Utilities;

public class MyRectangle2D 
{
	private double x, y, width, height;
	
	public MyRectangle2D()
	{
		this(0, 0, 1, 1);
	}
	
	public MyRectangle2D(double x, double y, double width, double height)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public double getArea()
	{
		return getWidth() * getHeight();
	}
	
	public double getPerimeter()
	{
		return (getWidth() * 2) + (getHeight() * 2); 
	}
	
	public boolean contains(double x, double y)
	{
		return (getWidth() > 0 && 
				getHeight() > 0 && 
				x > getX() && 
				x < (getX() + getWidth()) && 
				y >= getY() && 
				y < (getY() + getHeight()));
	}
	
	public boolean contains(MyRectangle2D r)
	{
		return (getWidth() > 0 && 
				getHeight() > 0 && 
				r.getX() > getX() && 
				r.getX() < (getX() + getWidth()) && 
				r.getY() >= getY() && 
				r.getY() < (getY() + getHeight()));
	}
	
	public boolean overlaps(MyRectangle2D r)
	{
		return x < r.x + r.width && x + width > r.x && y < r.y + r.height && y + height > r.y;
	}

	public double getX() 
	{
		return x;
	}

	public void setX(double x) 
	{
		this.x = x;
	}

	public double getY() 
	{
		return y;
	}

	public void setY(double y) 
	{
		this.y = y;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
}