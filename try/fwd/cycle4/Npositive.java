import java.util.*;
class NegativeInputException extends Exception 
{
    public NegativeInputException(String message) 
    {
        super(message);
    }
}

public class Npositive 
{
    public static double calculateAverage(List<Integer> numbers) throws NegativeInputException 
    {
        List<Integer> positiveNumbers = new ArrayList<>();
        int total = 0;

        for (int num : numbers) 
        {
            if (num < 0) 
            {
                throw new NegativeInputException("Negative input detected: " + num);
            }
            positiveNumbers.add(num);
            total += num;
        }

        double average = (double) total / positiveNumbers.size();
        return average;
    }

    public static void main(String[] args) 
    {
        System.out.println("J Siddharth");
        System.out.println("SJC22MCA-2034");
        System.out.println("23-06-2023");
        System.out.println("20MCA132 , Object Oriented Programming Lab \n\n");
        Scanner scanner = new Scanner(System.in);
        try 
        {
            System.out.print("Enter the total number of positive integers: ");
            int n = scanner.nextInt();
            List<Integer> integers = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                System.out.print("Enter a positive integer: ");
                int num = scanner.nextInt();
                integers.add(num);
        }

            double result = calculateAverage(integers);
            System.out.println("Average: " + result);

        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Invalid input! Please enter a valid positive integer.");

        } 
        catch (NegativeInputException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

