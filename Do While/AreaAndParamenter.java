// WAP to ask the user to input radius of circle until user gives positive radius. Then calculate area and perimeter of circle. using do while loop.

import java.util.Scanner;

public class AreaAndParamenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float radius;
        
        // Keep asking for radius until positive value is entered
        do {
            System.out.print("Enter the radius of the circle: ");
            radius = scanner.nextFloat();
            
            if (radius <= 0) {
                System.out.println("Please enter a positive radius!");
            }
        } while (radius <= 0);

        // Calculate area and perimeter
        float area = (float)(Math.PI * radius * radius);
        float perimeter = (float)(2 * Math.PI * radius);
        
        // Display results
        System.out.println("Area of the circle: " + area);
        System.out.println("Perimeter of the circle: " + perimeter);
        
        scanner.close();
    }
}
