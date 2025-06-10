import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Program to check if a number is even or odd using modulus operator");
        
        String choice = "yes";
        
        // Using a loop to allow multiple checks
        while (choice.equalsIgnoreCase("yes")) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            // Using nested if for demonstration
            if (number != 0) {
                // Using modulus to check if number is even or odd
                if (number % 2 == 0) {
                    System.out.println(number + " is an even number.");
                } else {
                    System.out.println(number + " is an odd number.");
                }
            } else {
                // Special case for zero
                System.out.println("Zero is not an even or odd number.");
            }
            
            // Ask if user wants to check another number
            System.out.print("Do you want to check another number? (yes/no): ");
            choice = scanner.nextLine();
        }
        
        System.out.println("Thank you for using the Even-Odd Checker!");
        
        scanner.close();
    }
} 