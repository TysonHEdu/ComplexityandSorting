package shape;

public abstract class Prism extends Shape
{
    //declare side as a private variable
    private double side;

    public Prism(double height, double side) {
        super(height);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getVolume() {
        return getBaseArea() * getHeight();
    }

    public abstract double getBaseArea();
}

