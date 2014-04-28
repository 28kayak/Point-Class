//Mypoint.java
public class Mypoint implements Point
{
	private double x;
	private double y;
	public static Point ORIGIN = new Mypoint();

	private Mypoint()
	{
		//defalt constractor 
	}
	public Mypoint(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	public double amplitude()
	{
		return atan(y/x);
	}
	public double distanceTo(Point point)
	{
		if(point.equals(this))
		{
			return 0.0;
			
		}else if(!(point instanceof Mypoint)
		{
			throw new IllegalArgumentException("use a my point object");
		}
		else
		{
			Mypoint that = (MyPoint) point;
			double dx = that.x - that.y;
			double dy = that.y - that.x;
			return Math.sqrt(dx*dx - dy*dy);
		}
	}
	public boolean equals(Object object)
	{
		if(object == this)
		{
			return true;
		}
		else if(!())
	}

}