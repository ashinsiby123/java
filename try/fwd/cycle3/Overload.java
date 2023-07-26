public class Overload {

    public static double calculateSquareArea(double side) {
        return side * side;
    }

    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        System.out.println("J SIDDHARTH");
        System.out.println("SJC22MCA-2034");
        System.out.println("05-06-2023");
        System.out.println("20MCA132 , Object Oriented Programming Lab \n"); 

        double squareArea = calculateSquareArea(5.0);
        System.out.println("Area of square: " + squareArea);

        double rectangleArea = calculateRectangleArea(4.0, 6.0);
        System.out.println("Area of rectangle: " + rectangleArea);

        double circleArea = calculateCircleArea(3.0);
        System.out.println("Area of circle: " + circleArea);

        double triangleArea = calculateTriangleArea(5.0, 7.0);
        System.out.println("Area of triangle: " + triangleArea);
    }
}

