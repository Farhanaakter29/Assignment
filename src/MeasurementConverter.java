//exercise 4.5
import java.util.Scanner;

public class MeasurementConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter measurement in meters: ");
        double meters = sc.nextDouble();
        double miles = meters * 0.000621371;
        double feet = meters * 3.28084;
        double inches = meters * 39.3701;
        System.out.println(meters);
        System.out.println(miles);
        System.out.println(feet);
        System.out.println(inches);
        sc.close();
    }
}

