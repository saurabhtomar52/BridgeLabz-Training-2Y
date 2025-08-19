public class SimpleInterestCalculator {

    public static void main(String[] args) {
        // Hard-coded values for simplicity
        double principal = 1000.00;
        double rate = 5.0;
        double time = 2.0;

        // Calculate simple interest using the formula
        double simpleInterest = (principal * rate * time) / 100;

        // Print the final result
        System.out.println("The simple interest is: " + simpleInterest);
    }
}

