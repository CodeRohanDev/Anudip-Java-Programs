// Write a program to find out the greatest number among three numbers

import java.util.Scanner;

public class GreatestBetweenThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter three numbers
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Compare the numbers using nested if-else statements
        // First check if num1 is greater than num2
        if (num1 > num2) {
            // If num1 > num2, then compare num1 with num3
            if (num1 > num3) {
                System.out.println("The greatest number is: " + num1);
            } else {
                System.out.println("The greatest number is: " + num3);
            }
        } else {
            // If num2 > num1, then compare num2 with num3
            if (num2 > num3) {
                System.out.println("The greatest number is: " + num2);
            } else {
                System.out.println("The greatest number is: " + num3);
            }
        }
        
    }
}