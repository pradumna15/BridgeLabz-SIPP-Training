import java.util.Scanner;

public class Question20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter yards: ");
        double yards = scanner.nextDouble();
        System.out.println("Yards to Feet: " + convertYardsToFeet(yards));

        System.out.print("Enter feet: ");
        double feet = scanner.nextDouble();
        System.out.println("Feet to Yards: " + convertFeetToYards(feet));

        System.out.print("Enter meters: ");
        double meters = scanner.nextDouble();
        System.out.println("Meters to Inches: " + convertMetersToInches(meters));

        System.out.print("Enter inches: ");
        double inches = scanner.nextDouble();
        System.out.println("Inches to Meters: " + convertInchesToMeters(inches));

        System.out.print("Enter inches (again): ");
        double inches2 = scanner.nextDouble();
        System.out.println("Inches to Centimeters: " + convertInchesToCm(inches2));
    }

    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }
}
