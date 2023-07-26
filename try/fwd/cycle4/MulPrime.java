class MultiplicationTableThread extends Thread {
    @Override
    public void run() {
        System.out.println("J Siddharth");
        System.out.println("SJC22MCA-2034");
        System.out.println("23-06-2023");
        System.out.println("20MCA132 , Object Oriented Programming Lab \n\n");
System.out.println("-----------OUTPUT---------");
        System.out.println("Multiplication Table of 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + (5 * i));
        }

        // Start PrimeNumbersThread after printing the multiplication table
        new PrimeNumbersThread(10).start();
    }
}
class PrimeNumbersThread extends Thread {
    private int count;

    public PrimeNumbersThread(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        System.out.println("First " + count + " Prime Numbers:");
        int num = 2;
        int primeCount = 0;

        while (primeCount < count) {
            if (isPrime(num)) {
                System.out.println(num);
                primeCount++;
            }
            num++;
        }
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
public class MulPrime {
    public static void main(String[] args) {
        new MultiplicationTableThread().start();
    }
}

