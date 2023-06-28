import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Q15 {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();

        Scanner scanner = new Scanner(System.in);

  System.out.println("Name : Ashin Siby");
      System.out.println("Reg No: 22MCA014");
      System.out.println("Course Code and Name: 20MCA132, Object Oriented Programming Lab");
      System.out.println("Date:23/06/2023");
      System.out.println("---------------------------");
      
        System.out.print("Enter the number of elements to add: ");
        int numElements = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < numElements; i++) {
            int element = scanner.nextInt();
            set.add(element);
        }

        System.out.println("Elements in the set:");
        for (int element : set) {
            System.out.println(element);
        }

        scanner.close();
    }
}

