//Exercise 4.2
import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = sc.nextDouble();
        double square = number * number;
        double cube = Math.pow(number, 3);
        double fourthPower = Math.pow(number, 4);
        System.out.printf("Square:%.2f\n",square);
        System.out.printf("Cube:%.2f\n",cube);
        System.out.printf("Fourth Power:%.2f\n",fourthPower);

    }
}

