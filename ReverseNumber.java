import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // To take input from the user

        System.out.print("Enter a number: ");
        String inputStr = scanner.nextLine(); // Read input as string to preserve zeros
        
        String result = "";
        boolean isNegative = false;
        
        // Check if number is negative
        if (inputStr.startsWith("-")) {
            isNegative = true;
            inputStr = inputStr.substring(1); // Remove negative sign
        }
        
        // Reverse the string
        for (int i = inputStr.length() - 1; i >= 0; i--) {
            result += inputStr.charAt(i);
        }
        
        // Add negative sign back if needed
        if (isNegative) {
            result = "-" + result;
        }

        System.out.println("Reversed number is: " + result); // Print result

        scanner.close(); // Close the Scanner
    }
}