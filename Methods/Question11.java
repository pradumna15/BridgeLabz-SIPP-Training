import java.util.Scanner;

public class Question11 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side 1 of the park (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2 of the park (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3 of the park (in meters): ");
        double side3 = scanner.nextDouble();

        double rounds = calculateRounds(side1, side2, side3);

        System.out.println("The athlete must complete approximately " + rounds + " rounds to complete 5 km.");
    }

    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distanceToCover = 5000; // 5 km in meters
        return distanceToCover / perimeter;
    }

   
}
