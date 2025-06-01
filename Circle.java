// write a java program to calculate area and perimeter of the circle

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get radius from user
        System.out.print("Enter radius of circle (in units): ");
        float radius = scanner.nextFloat();
        
        // Calculate area using formula: A = π * r^2
        float area = (float) (Math.PI * radius * radius);
        
        // Calculate perimeter using formula: P = 2 * π * r
        float perimeter = (float) (2 * Math.PI * radius);
        
        // Display results
        System.out.println("\nRadius of Circle = " + radius + " units");
        System.out.println("Area of Circle = " + area + " square units");
        System.out.println("Perimeter of Circle = " + perimeter + " units");
    }
}
