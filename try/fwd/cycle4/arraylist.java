import java.util.*;
public class arraylist{
public static void main(String[] args) {
ArrayList<String> arrayList= new ArrayList<>();
arrayList.add("Bibin");
arrayList.add("Rony");
arrayList.add("Tarun");
arrayList.add("Jack");
        System.out.println("J Siddharth");
        System.out.println("SJC22MCA-2034");
        System.out.println("27-06-2023");
        System.out.println("20MCA132 , Object Oriented Programming Lab \n\n");
System.out.println("-----------OUTPUT---------");
System.out.println("The elements ofthe arraylist is - "+arrayList);
Collections.sort(arrayList);
System.out.println("\nThe ArrayList Sort : "+arrayList); // ArrayList Sort
Collections.addAll(arrayList,"Karun","Vimal","Shan","Ram","Gibin");
System.out.println("\nAdding new items in the arraylist is : "+arrayList); // ArrayList AddAll
Collections.sort(arrayList, Collections.reverseOrder()); //Arraylist in reverse order
System.out.println("\nThe reverse order of the arraylist : "+arrayList);
System.out.println("\nThe maximum element ofthe arraylist : "+Collections.max(arrayList));
//Max elements in the arraylist
}
}
