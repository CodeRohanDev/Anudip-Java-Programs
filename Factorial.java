// Write a program to find out the factorial of given number
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt and get number from user
        System.out.print("Enter a number to calculate factorial: ");
        int number = scanner.nextInt();
        
        // Handle negative numbers
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculate factorial
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Display the result
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }
}
