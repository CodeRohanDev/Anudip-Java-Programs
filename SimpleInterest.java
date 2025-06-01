// write a java program to calculate simple interest

public class SimpleInterest {
    public static void main(String[] args) {
        // Principal amount in Rupees
        double principal = 1000.0;
        // Interest rate (5%)
        double rate = 5.0;
        // Time period in years
        int time = 2;
        
        // Calculate Simple Interest :- SI = (P * R * T)/100
        double simpleInterest = (principal * rate * time) / 100;
        
        System.out.println("\nSimple Interest = " + simpleInterest + " Rupees");
    }
}
