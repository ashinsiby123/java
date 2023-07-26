import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Create a LinkedHashSet
        Set<String> set = new LinkedHashSet<>();

        // Add elements to the set
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple"); // Adding a duplicate element

        // Print the set
        System.out.println("J Siddharth");
        System.out.println("SJC22MCA-2034");
        System.out.println("27-06-2023");
        System.out.println("20MCA132 , Object Oriented Programming Lab \n\n");
System.out.println("-----------OUTPUT---------");
        System.out.println("Set elements: " + set);

        // Check if an element exists in the set
        boolean containsBanana = set.contains("Banana");
        System.out.println("Contains 'Banana'? " + containsBanana);

        // Remove an element from the set
        boolean removedOrange = set.remove("Orange");
        System.out.println("Removed 'Orange'? " + removedOrange);

        // Print the set after removal
        System.out.println("Set after removal: " + set);
    }
}

