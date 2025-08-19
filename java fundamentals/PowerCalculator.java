import java.util.Scanner;
import java.lang.Math;

public class PowerCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base;
        double exponent;
        System.out.print("Enter the base number: ");
        base = scanner.nextDouble();
        System.out.print("Enter the exponent: ");
        exponent = scanner.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        scanner.close();
    }
}

