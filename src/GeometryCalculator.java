//exercise 4.6
import java.util.Scanner;

public class GeometryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = sc.nextDouble();
        double circleArea = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        double sphereVolume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        double sphereSurfaceArea = 4 * Math.PI * Math.pow(radius, 2);
        System.out.println("Area: " + circleArea);
        System.out.println("Circumference: " + circumference);

        System.out.println("Volume: " + sphereVolume);
        System.out.println("Surface Area: " + sphereSurfaceArea);
        sc.close();
    }
}
