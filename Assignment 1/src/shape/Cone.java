package shape;

public class Cone extends Shape
{
	//attributes/data fields
	private double radius;
	
	//constructor
	public Cone(double height, double radius)
	{
		super(height);
		this.radius = radius;
	}
	

	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	@Override
	public double getVolume() 
	{
		return getBaseArea() * getHeight() / 3;
	}

	@Override
	public double getBaseArea() 
	{
		return Math.PI * radius * radius;
	}
	
	@Override
	public String toString()
	{
		return "Cone " +super.toString();
	}
	
}
