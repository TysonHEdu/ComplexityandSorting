package shape;

public class Pyramid extends Shape
{
    private double sideLength;

    public Pyramid(double height, double sideLength)
    {
        super(height);
        this.sideLength = sideLength;
    }

    @Override
    public double getBaseArea()
    {
        return sideLength * sideLength;
    }

    @Override
    public double getVolume()
    {
        return (1.0 / 3.0) * getBaseArea() * height;
    }
}
