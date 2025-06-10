import java.util.Scanner;

public class GreatestDigit {
    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt and get number from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Math.abs() returns absolute value
        int absNumber = Math.abs(number);
        
        // Special case: if number is 0
        if(absNumber == 0){
            System.out.println("The greatest digit is: 0");
        }
        else {
            // Variable to store the largest digit found
            int greatestDigit = 0;
            
            // Extract each digit and compare
            while(absNumber > 0){
                // Get rightmost digit using modulo
                int digit = absNumber % 10;
                
                // Update greatestDigit if current digit is larger
                if(digit > greatestDigit){
                    greatestDigit = digit;
                }
                
                // Remove rightmost digit by integer division
                absNumber = absNumber / 10;
            }
            
            // Display the result
            System.out.println("The greatest digit is: " + greatestDigit);
        }
        
        // Clean up resources
        scanner.close();
    }
}
