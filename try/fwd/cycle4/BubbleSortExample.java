import java.util.Arrays;
public class BubbleSortExample {
    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    // Swap elements
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("J Siddharth");
        System.out.println("SJC22MCA-2034");
        System.out.println("27-06-2023");
        System.out.println("20MCA132 , Object Oriented Programming Lab \n\n");
System.out.println("-----------OUTPUT---------");
        Integer[] numbers = {4, 2, 6, 1, 9, 3, 8, 5, 7};
        bubbleSort(numbers);
        System.out.println("Sorted numbers: " + Arrays.toString(numbers));

        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};
        bubbleSort(names);
        System.out.println("Sorted names: " + Arrays.toString(names));
    }
}

