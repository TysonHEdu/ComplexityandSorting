package shape;

public abstract class Shape implements Comparable<Shape>
{
	//attribute(s)/data field(s)
	private double height;

	//constructor
	public Shape(double height) 
	{
		this.height = height;
	}


	//operational methods
	//getter/accessor
	public double getHeight() {
		return height;
	}
	//setter/mutator
	public void setHeight(double height) {
		this.height = height;
	}
	
	public abstract double getVolume();

	public abstract double getBaseArea();
	
	@Override
	public int compareTo(Shape that)
	{
		if (this.height <that.height)
		{
			return -1;
		}
		if (this.height < that.height)
		{
			return 1;
		}
		return 0;
	}


	@Override
	public String toString() {
		return "Shape with height: " + getHeight() + ", Volume: " + getVolume() + "BaseArea: " + getBaseArea();
	}
	
	
}
