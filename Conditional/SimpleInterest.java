// write a java program to calculate simple interest

import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get principal amount from user
        System.out.print("Enter principal amount (in Rupees): ");
        float principal = scanner.nextFloat();

        // Get interest rate from user
        System.out.print("Enter interest rate (%): ");
        float rate = scanner.nextFloat();

        // Get time period from user
        System.out.print("Enter time period (in years): ");
        int time = scanner.nextInt();
        
        // Check if inputs are valid
        if (principal <= 0) {
            System.out.println("Principal amount must be greater than 0");
        }
        else if (rate <= 0) {
            System.out.println("Interest rate must be greater than 0");
        }
        else if (time <= 0) {
            System.out.println("Time period must be greater than 0");
        }
        else {
            // Calculate Simple Interest :- SI = (P * R * T)/100
            float simpleInterest = (principal * rate * time) / 100;
            
            System.out.println("\nSimple Interest = " + simpleInterest + " Rupees");
        }
    }
}
