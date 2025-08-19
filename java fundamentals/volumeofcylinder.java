import java.util.Scanner;

public class volumeofcylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int height=sc.nextInt();
        int radius=sc.nextInt();
        double Volume = 3.14 * radius*radius * height;
        System.out.println("volume of cylinder is "+ Volume);
        
    }
    
}
