// Write a program to find out profit or loss

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter cost price and selling price
        System.out.println("Enter the cost price: ");
        double costPrice = scanner.nextDouble();

        System.out.println("Enter the selling price: ");
        double sellingPrice = scanner.nextDouble();

        // Calculate profit/loss
        double difference = sellingPrice - costPrice;

        // Check if there is profit, loss or no profit/loss
        if (difference > 0) {
            System.out.println("Profit of Rs. " + difference);
        } else if (difference < 0) {
            System.out.println("Loss of Rs. " + Math.abs(difference));
        } else {
            System.out.println("No profit, no loss");
        }
    }
}
