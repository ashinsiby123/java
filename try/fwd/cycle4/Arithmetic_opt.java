import arithmetic.*;

public class Arithmetic_opt {
    public static void main(String[] args) {
        System.out.println("J Siddharth");
        System.out.println("SJC22MCA-2034");
        System.out.println("16-06-2023");
        System.out.println("20MCA132 , Object Oriented Programming Lab \n\n");
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

