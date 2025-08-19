import java.util.Scanner;

public class KilometerToMilesConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kilometers;
        double miles;
        System.out.print("Enter the distance in kilometers: ");
        kilometers = scanner.nextDouble();
        miles = kilometers * 0.621371;
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
        scanner.close();
    }
}

