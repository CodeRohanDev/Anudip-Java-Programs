// WAP to find Even and Odd

import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get number from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // First check if number is zero
        if (number == 0) {
            System.out.println("Zero is neither even nor odd.");
        }
        // Check if the number is even or odd
        else {
            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        }
    }
}