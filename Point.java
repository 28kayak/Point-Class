//Point.java
//ADT: Point 
//amplitude():real 
//distanceTo():real
//equals(Point): boolean 
//magnitude():real
//toString() String 
//xCoordinate()
//yCoordinate()
public interface Point 
{
	public double amplitude(); 
	public double distanceTo();
	public boolean equals(Point apoint);
	public double magnitude();
	public String toString();
	public double xCoordinate();
	public double yCoordinate();
}

