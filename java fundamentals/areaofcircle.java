import java.util.Scanner;
public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the radious of circle:");
        double radius=sc.nextInt();
        double Area = 3.14 * radius*radius;
        System.out.println("Area of circle is: "+ Area);
    }
}


