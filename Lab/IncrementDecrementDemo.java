public class IncrementDecrementDemo {
    public static void main(String[] args) {
        int x = 5; // Initialize a simple variable
        
        System.out.println("Demonstrating increment (++) operator:");
        System.out.println("Initial value of x: " + x);
        
        // Pre-increment
        System.out.println("Pre-increment (++x): " + (++x));
        System.out.println("Value after pre-increment: " + x);
        
        // Post-increment 
        System.out.println("\nPost-increment (x++): " + (x++));
        System.out.println("Value after post-increment: " + x);
        
        System.out.println("\nDemonstrating decrement (--) operator:");
        System.out.println("Current value of x: " + x);
        
        // Pre-decrement
        System.out.println("Pre-decrement (--x): " + (--x));
        System.out.println("Value after pre-decrement: " + x);
        
        // Post-decrement
        System.out.println("\nPost-decrement (x--): " + (x--));
        System.out.println("Value after post-decrement: " + x);
    }
}