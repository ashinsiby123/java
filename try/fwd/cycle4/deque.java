import java.util.*;
class deque
{
public static void main(String[] args)
{
Deque<String> deque = new LinkedList<String>();
deque.add("Java");
deque.addFirst("Python");
deque.addLast("Datastructure");
deque.push("Web-programming");
deque.offer("Networking");
deque.offerFirst("DBMS");
        System.out.println("J Siddharth");
        System.out.println("SJC22MCA-2034");
        System.out.println("27-06-2023");
        System.out.println("20MCA132 , Object Oriented Programming Lab \n\n");
System.out.println("-----------OUTPUT---------");
System.out.println(deque + "\n");
deque.removeFirst();
deque.removeLast();
System.out.println("Deque after removing " + "first and last: " + deque);
}
}
