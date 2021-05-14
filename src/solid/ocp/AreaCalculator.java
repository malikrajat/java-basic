package solid.ocp;

public class AreaCalculator {
    public double doubleArea(Rectangle[] shapes) {
        double area = 0;
        for (Rectangle shape: shapes) {
            area += shape.Width * shape.Height;
        }
        return area;
    }
    public double circleArea(Circle[] shapes) {
        double area = 0;
        for (Circle shape: shapes) {
            area = (Math.PI * (shape.Radius *2));
        }
        return area;
    }
}
