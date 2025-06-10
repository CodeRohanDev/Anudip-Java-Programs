import java.util.Scanner;

public class TriangleValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get three angles from user
        System.out.println("Enter three angles to check if they form a triangle:");
        System.out.print("Enter first angle: ");
        double angle1 = scanner.nextDouble();
        
        System.out.print("Enter second angle: ");
        double angle2 = scanner.nextDouble();
        
        System.out.print("Enter third angle: ");
        double angle3 = scanner.nextDouble();
        
        // First check if any angle is negative
        if (angle1 > 0 && angle2 > 0 && angle3 > 0 && (angle1 + angle2 + angle3) == 180) {
            if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
                System.out.println("It is an Acute triangle.");
            } else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("It is a Right-angled triangle.");
            } else {
                System.out.println("It is a regular triangle.");
            }
        }
        // Check if angles form a triangle and classify it
        // Sum of angles must be 180 degrees and all angles must be positive
         else {
            System.out.println("These angles do not form a triangle.");
        }

        scanner.close();
    }
}