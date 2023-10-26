package shape;

public class Cylinder extends Shape
{	
    //had to declare radius as a private variable
    private double radius;

    public Cylinder(double height, double radius)
    {
        super(height);
        this.radius = radius;
    }

    @Override
    public double getBaseArea()
    {
        return Math.PI * radius * radius;
    }

    @Override
    public double getVolume()
    {
        return getBaseArea() * getHeight();
    }
}
