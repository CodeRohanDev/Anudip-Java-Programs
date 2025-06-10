// Write a program to find out the sum of first 30 even natural numbers
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        // Variables to store sum and count of even numbers
        int sum = 0;
        int count = 0;
        int number = 2;  // Start with first even number
        
        // Loop until we find 30 even numbers
        while (count < 30) {
            sum += number;
            number += 2;  // Move to next even number
            count++;
        }
        
        // Display the result
        System.out.println("Sum of first 30 even natural numbers is: " + sum);
    }
}
