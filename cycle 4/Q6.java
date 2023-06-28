import java.util.Scanner;

class Fibonacci implements Runnable {
    private int count;

    public Fibonacci(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        System.out.println("Fibonacci numbers:");
        int num1 = 0;
        int num2 = 1;
        System.out.println(num1);
        System.out.println(num2);

        for (int i = 2; i < count; i++) {
            int fib = num1 + num2;
            System.out.println(fib);
            num1 = num2;
            num2 = fib;
        }
    }
}

class EvenNumber implements Runnable {
    private int start;
    private int end;

    public EvenNumber(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        System.out.println("Even numbers from " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

public class Q6 {
    public static void main(String[] args) {
        
          System.out.println("Name : Ashin Siby");
      System.out.println("Reg No: 22MCA014");
      System.out.println("Course Code and Name: 20MCA132, Object Oriented Programming Lab");
      System.out.println("Date:23/06/2023");
      System.out.println("---------------------------");
    
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the count of Fibonacci numbers: ");
        int fibonacciCount = scanner.nextInt();

        System.out.print("Enter the start of the range for even numbers: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the range for even numbers: ");
        int end = scanner.nextInt();

        scanner.close();

        Thread fibonacciThread = new Thread(new Fibonacci(fibonacciCount));
        Thread evenNumberThread = new Thread(new EvenNumber(start, end));

        fibonacciThread.start();
        evenNumberThread.start();
    }
}

