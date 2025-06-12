// Write a program to calculate factorial of number
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check for negative numbers
        if (number < 0) {
            System.out.println("Factorial cannot be calculated for negative numbers");
            return; 
        }
        
        // Calculate factorial
        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        
        // Print result
        System.out.println("Factorial of " + number + " = " + result);
        
        scanner.close();
    }
}
