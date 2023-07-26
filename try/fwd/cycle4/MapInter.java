import java.util.HashMap;
import java.util.Map;

public class MapInter {
    public static void main(String[] args) {
        // Create a new HashMap
        Map<String, Integer> map = new HashMap<>();

        // Add elements to the map
        map.put("John", 25);
        map.put("Alice", 30);
        map.put("Bob", 35);

        // Print the initial map
        System.out.println("J Siddharth");
        System.out.println("SJC22MCA-2034");
        System.out.println("23-06-2023");
        System.out.println("20MCA132 , Object Oriented Programming Lab \n\n");;
System.out.println("-----------OUTPUT---------");
        System.out.println("Initial Map: " + map);

        // Changing an element
        map.put("Alice", 32);

        // Print the map after changing an element
        System.out.println("Map after changing an element: " + map);

        // Removing an element
        map.remove("Bob");

        // Print the map after removing an element
        System.out.println("Map after removing an element: " + map);
    }
}

