// Square.java
package Graphics;
public class Square implements Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }
}
