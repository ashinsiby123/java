import Graphics.*;
import java.util.*;
public class GraphicsPackage
 {
    public static void main(String[] args) {
        System.out.println("J Siddharth");
        System.out.println("SJC22MCA-2034");
        System.out.println("16-06-2023");
        System.out.println("20MCA132 , Object Oriented Programming Lab \n\n");
        Rectangle rectangle = new Rectangle(5, 7);
        double rectangleArea = rectangle.calculateArea();
        System.out.println("Rectangle Area: " + rectangleArea);

        Triangle triangle = new Triangle(4, 6);
        double triangleArea = triangle.calculateArea();
        System.out.println("Triangle Area: " + triangleArea);

        Square square = new Square(5);
        double squareArea = square.calculateArea();
        System.out.println("Square Area: " + squareArea);

        Circle circle = new Circle(3);
        double circleArea = circle.calculateArea();
        System.out.println("Circle Area: " + circleArea);
    }
}

