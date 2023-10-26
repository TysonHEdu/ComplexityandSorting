package shape;

public class PentagonalPrism extends Prism
{
    //had to declare sideLength as a private variable
    private double sideLength;

    public PentagonalPrism(double height, double sideLength)
    {
        super(height, sideLength);
        this.sideLength = sideLength;
    }

    @Override
    public double getBaseArea()
    {
        return (5 * sideLength * sideLength * Math.tan(Math.toRadians(54))) / 4;
    }

    @Override
    public double getVolume()
    {
        return getBaseArea() * getHeight();
    }
}