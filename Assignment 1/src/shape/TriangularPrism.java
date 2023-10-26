package shape;

public class TriangularPrism extends Prism
{
    private double sideLength;

    public TriangularPrism(double height, double sideLength) {
        super(height, sideLength);
        this.sideLength = sideLength;
    }

    @Override
    public double getBaseArea() {
        return (Math.sqrt(3) / 4) * sideLength * sideLength;
    }

    @Override
    public double getVolume() {
        return getBaseArea() * getHeight();
    }
}
