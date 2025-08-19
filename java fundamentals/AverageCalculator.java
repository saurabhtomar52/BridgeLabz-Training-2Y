import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, num3;
        double average;
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        num3 = scanner.nextDouble();
        average = (num1 + num2 + num3) / 3;
        System.out.println("The average of the three numbers is: " + average);
        scanner.close();
    }
}

