import java.util.Scanner;

public class SimplePrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Get user input

        boolean isPrime = true; // Assume the number is prime

        // Numbers less than or equal to 1 are not prime
        if (num <= 1) {
            isPrime = false;
        }

        // Check for factors from 2 to num - 1
        for (int i = 2; i < num; i++) {
            if (num % i == 0) { // If num is divisible by i
                isPrime = false;
                break; // Exit loop early
            }
        }

        // Show result
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        sc.close(); // Close the scanner
    }
}