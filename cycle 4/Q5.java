import java.util.ArrayList;
import java.util.List;

class TableGenerator implements Runnable {
    @Override
    public void run() {
        System.out.println("Multiplication table of 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }
    }
}

class PrimeNumber implements Runnable {
    private int count;

    public PrimeNumber(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        System.out.println("First " + count + " prime numbers:");
        List<Integer> primeNumbers = new ArrayList<>();
        int num = 2;
        while (primeNumbers.size() < count) {
            if (isPrime(num)) {
                primeNumbers.add(num);
            }
            num++;
        }

        for (int prime : primeNumbers) {
            System.out.println(prime);
        }
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
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

public class Q5 {
    public static void main(String[] args) {
      System.out.println("Name : Ashin Siby");
      System.out.println("Reg No: 22MCA014");
      System.out.println("Course Code and Name: 20MCA132, Object Oriented Programming Lab");
      System.out.println("Date:23/06/2023");
      System.out.println("---------------------------");
    
        Thread multiplicationTableThread = new Thread(new TableGenerator());
        Thread primeNumberThread = new Thread(new PrimeNumber(10));

        multiplicationTableThread.start();
        primeNumberThread.start();
    }
}

