package shape;

public class SquarePrism extends Prism
{
    private double sideLength;

    public SquarePrism(double height, double sideLength) {
        super(height, sideLength);
        this.sideLength = sideLength;
    }

    @Override
    public double getBaseArea() {
        return sideLength * sideLength;
    }

    @Override
    public double getVolume() {
        return getBaseArea() * getHeight();
    }
}

