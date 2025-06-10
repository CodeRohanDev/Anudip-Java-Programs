import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Simple Calculator");
        System.out.println("Operations: +, -, *, /, %");
        
        // Input first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        // Input second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        // Input operator
        System.out.print("Enter operator (+, -, *, /, %): ");
        scanner.nextLine(); // Consume newline
        String operator = scanner.nextLine();
        
        // Variable to store result
        double result = 0;
        boolean validOperator = true;
        
        // Using switch to perform operation based on operator
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                // Validation for division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperator = false;
                }
                break;
            case "%":
                // Validation for modulus by zero
                if (num2 != 0) {
                    result = num1 % num2;
                } else {
                    System.out.println("Error: Modulus by zero is not allowed.");
                    validOperator = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operator. Please use +, -, *, /, or %.");
                validOperator = false;
                break;
        }
        
        // Display result if operator was valid
        if (validOperator) {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }
        
        scanner.close();
    }
}