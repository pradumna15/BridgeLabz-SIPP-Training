package ragesAndJUnit;

public class VehicleNumberValidator {
    public static boolean isValidPlate(String plate) {
        return plate.matches("^[A-Z]{2}\\d{2}[A-Z]{2}\\d{4}$");
    }

    public static void main(String[] args) {
        System.out.println(isValidPlate("UP32AB1234")); // true
        System.out.println(isValidPlate("1234ABUP32")); // false
    }
}
