package solid.ocp;

public class Rectangle implements IShape {
    public double Width;
    public double Height;

    @Override
    public double Area() {
        return Width * Height;
    }
}
