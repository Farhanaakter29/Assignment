//Exercise 4.4
import java.util.Scanner;

public class EnhancedCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double average = sum / 2;
        double distance = Math.abs(difference);
        double maximum = Math.max(num1, num2);
        double minimum = Math.min(num1, num2);

        System.out.printf("Sum:%.2f\n",sum);
        System.out.printf("Difference:%.2f\n",difference);
        System.out.printf("Product:%.2f\n",product);
        System.out.printf("Average:%.2f\n",average);
        System.out.printf("Distance:%.2f\n",distance);
        System.out.printf("Maximum:%.2f\n",maximum);
        System.out.printf("Minimum:%.2f\n",minimum);

    }
}