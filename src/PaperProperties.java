//exercise 4.1
public class PaperProperties {
    // Constant for millimeters per inch
    public static final double MILLIMETERS_PER_INCH = 25.4;

    public static void main(String[] args) {
        // Width and height of letter-size paper in inches
        double widthInInches = 8.5;
        double heightInInches = 11.0;
        // Convert width and height to millimeters
        double widthInMillimeters = widthInInches * MILLIMETERS_PER_INCH;
        double heightInMillimeters = heightInInches * MILLIMETERS_PER_INCH;
        // Calculate perimeter
        double perimeterInMillimeters = 2 * (widthInMillimeters + heightInMillimeters);
        // Calculate length of the diagonal using Pythagorean theorem
        double diagonalLengthInMillimeters = Math.sqrt(Math.pow(widthInMillimeters, 2) + Math.pow(heightInMillimeters, 2));
        // Print the properties
        System.out.println("Letter-size paper properties in millimeters:");
        System.out.println("Width: " + widthInMillimeters + " mm");
        System.out.println("Height: " + heightInMillimeters + " mm");
        System.out.println("Perimeter: " + perimeterInMillimeters + " mm");
        System.out.println("Length of the diagonal: " + diagonalLengthInMillimeters + " mm");
    }
}
