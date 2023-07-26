import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapToTreeMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 25);
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 35);

        // Convert HashMap to TreeMap
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);

        // Print the HashMap
        System.out.println("J Siddharth");
        System.out.println("SJC22MCA-2034");
        System.out.println("23-06-2023");
        System.out.println("20MCA132 , Object Oriented Programming Lab \n\n");
System.out.println("-----------OUTPUT---------");
        System.out.println("HashMap: " + hashMap);

        // Print the TreeMap
        System.out.println("TreeMap: " + treeMap);
    }
}

