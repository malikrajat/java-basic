package solid.ocp;

public class Circle implements IShape {
    public double Radius;

    @Override
    public double Area() {
        return (Math.PI * (Radius *2));
    }
}
