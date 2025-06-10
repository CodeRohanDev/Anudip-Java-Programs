import java.util.Scanner;

public class HCFCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input from user
        System.out.println("Enter two numbers to find their HCF :");
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        // Check for negative numbers
        if (num1 < 0 || num2 < 0) {
            System.out.println("Error: Negative numbers are not allowed.");
            scanner.close();
            return;
        }
        
        int a = num1;
        int b = num2;
        
        // If second number is 0, then HCF is the first number
        if (b == 0) {
            System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + a);
            scanner.close();
            return;
        }
        
        // Apply Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        // If second number is not 0, then apply Euclidean algorithm
        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + a);
        scanner.close();
    }
}