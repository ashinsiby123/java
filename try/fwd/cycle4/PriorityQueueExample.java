import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue
        Queue<Integer> queue = new PriorityQueue<>();

        // Add elements to the queue
        queue.offer(5);
        queue.offer(2);
        queue.offer(8);
        queue.offer(1);

        // Print the queue
        System.out.println("J Siddharth");
        System.out.println("SJC22MCA-2034");
        System.out.println("23-06-2023");
        System.out.println("20MCA132 , Object Oriented Programming Lab \n\n");
System.out.println("-----------OUTPUT---------");
        System.out.println("Queue elements: " + queue);

        // Retrieve and remove elements from the queue
        while (!queue.isEmpty()) {
            int element = queue.poll();
            System.out.println("Removed element: " + element);
        }
    }
}

