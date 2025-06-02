// WAP to check whether three angles form a triangle or not

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get three angles from user
        System.out.print("Enter the first angle: ");
        int angle1 = scanner.nextInt();

        System.out.print("Enter the second angle: ");
        int angle2 = scanner.nextInt();

        System.out.print("Enter the third angle: ");
        int angle3 = scanner.nextInt();

        // Check if the sum of angles is 180 degrees
        if (angle1 + angle2 + angle3 == 180) {
            System.out.println("The angles form a triangle.");
        } else {
            System.out.println("The angles do not form a triangle.");
        }
    }
}
