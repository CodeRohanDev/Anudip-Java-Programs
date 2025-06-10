import java.util.Scanner;

public class AssignmentOperatorsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Demonstration of Assignment Operators in Java");
        System.out.println("Available operators: =, +=, -=, *=, /=, %=");
        
        System.out.print("Enter a base number: ");
        int num = scanner.nextInt();
        
        System.out.println("Starting value: " + num);
        
        // Ask user which operator to demonstrate
        System.out.println("\nChoose an operator to demonstrate:");
        System.out.println("1. += (Addition Assignment)");
        System.out.println("2. -= (Subtraction Assignment)");
        System.out.println("3. *= (Multiplication Assignment)");
        System.out.println("4. /= (Division Assignment)");
        System.out.println("5. %= (Modulus Assignment)");
        System.out.print("Enter your choice (1-5): ");
        
        int choice = scanner.nextInt();
        
        // Ask for the value to use with the operator
        System.out.print("Enter a value to use with the operator: ");
        int value = scanner.nextInt();
        
        // Using if-else-if ladder to demonstrate different assignment operators
        if (choice == 1) {
            System.out.println("Demonstrating += operator");
            System.out.println("Before: num = " + num);
            num += value;  // Equivalent to: num = num + value
            System.out.println("After num += " + value + ": num = " + num);
            
        } else if (choice == 2) {
            System.out.println("Demonstrating -= operator");
            System.out.println("Before: num = " + num);
            num -= value;  // Equivalent to: num = num - value
            System.out.println("After num -= " + value + ": num = " + num);
            
        } else if (choice == 3) {
            System.out.println("Demonstrating *= operator");
            System.out.println("Before: num = " + num);
            num *= value;  // Equivalent to: num = num * value
            System.out.println("After num *= " + value + ": num = " + num);
            
        } else if (choice == 4) {
            if (value == 0) {
                System.out.println("Error: Cannot divide by zero!");
            } else {
                System.out.println("Demonstrating /= operator");
                System.out.println("Before: num = " + num);
                num /= value;  // Equivalent to: num = num / value
                System.out.println("After num /= " + value + ": num = " + num);
            }
            
        } else if (choice == 5) {
            if (value == 0) {
                System.out.println("Error: Cannot find modulus with zero!");
            } else {
                System.out.println("Demonstrating %= operator");
                System.out.println("Before: num = " + num);
                num %= value;  // Equivalent to: num = num % value
                System.out.println("After num %= " + value + ": num = " + num);
            }
            
        } else {
            System.out.println("Invalid choice! Please run the program again and select a number between 1 and 5.");
        }
        
        scanner.close();
    }
} 