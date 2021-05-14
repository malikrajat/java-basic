package solid.ocp;

public class Main {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[2];
        rectangles[0] = new Rectangle();
        rectangles[0].Height = 1;
        rectangles[0].Width = 1;

        rectangles[1] = new Rectangle();
        rectangles[1].Height = 2;
        rectangles[1].Width = 2;

        AreaCalculator areaCalculator = new AreaCalculator();
        double area =  areaCalculator.doubleArea(rectangles);

        System.out.println("Sum of Area of Rectangle is : (0)" + area);

        Circle[] circles = new Circle[2];
        circles[0] = new Circle();
        circles[0].Radius = 1;

        circles[1] = new Circle();
        circles[1].Radius = 1;
        double circleArea = areaCalculator.circleArea(circles);

        System.out.println("Area calc for Circle : " + circleArea);



    }
}
