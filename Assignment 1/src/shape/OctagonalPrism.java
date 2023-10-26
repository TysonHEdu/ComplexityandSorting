package shape;

public class OctagonalPrism extends Prism
{
    private double sideLength;

    public OctagonalPrism(double height, double sideLength)
    {
        super(height, sideLength);
        this.sideLength = sideLength;
    }

    //calculate the base area
    @Override
    public double getBaseArea()
    {
        double baseArea = 2 * sideLength * sideLength * (1 + Math.sqrt(2));
        return baseArea;
    }

    @Override
    public double getVolume()
    {
        return getBaseArea() * getHeight();
    }
}
