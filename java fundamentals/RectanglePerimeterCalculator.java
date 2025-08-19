import java.util.Scanner;

public class RectanglePerimeterCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length;
        double width;
        double perimeter;
        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        width = scanner.nextDouble();
        perimeter = 2 * (length + width);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        scanner.close();
    }
}

