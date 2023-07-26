import arithmetic.*;

public class  {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;

        Arithmetic addition = new Addition();
        double sum = addition.calculate(num1, num2);
        System.out.println("Sum: " + sum);

        Arithmetic subtraction = new Subtraction();
        double difference = subtraction.calculate(num1, num2);
        System.out.println("Difference: " + difference);

        Arithmetic multiplication = new Multiplication();
        double product = multiplication.calculate(num1, num2);
        System.out.println("Product: " + product);

        Arithmetic division = new Division();
        double quotient = division.calculate(num1, num2);
        System.out.println("Quotient: " + quotient);
    }
}

