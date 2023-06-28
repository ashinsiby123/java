import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q16 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        // Input for Set 1
  System.out.println("Name : Ashin Siby");
      System.out.println("Reg No: 22MCA014");
      System.out.println("Course Code and Name: 20MCA132, Object Oriented Programming Lab");
      System.out.println("Date:23/06/2023");
      System.out.println("---------------------------");

        System.out.print("Enter the number of elements in Set 1: ");
        int numElements1 = scanner.nextInt();
        System.out.println("Enter the elements for Set 1:");
        for (int i = 0; i < numElements1; i++) {
            int element = scanner.nextInt();
            set1.add(element);
        }

        // Input for Set 2
        System.out.print("Enter the number of elements in Set 2: ");
        int numElements2 = scanner.nextInt();
        System.out.println("Enter the elements for Set 2:");
        for (int i = 0; i < numElements2; i++) {
            int element = scanner.nextInt();
            set2.add(element);
        }

        // Comparison
        boolean isEqual = set1.equals(set2);

        // Output
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        if (isEqual) {
            System.out.println("Set 1 and Set 2 are equal.");
        } else {
            System.out.println("Set 1 and Set 2 are not equal.");
        }

        scanner.close();
    }
}
