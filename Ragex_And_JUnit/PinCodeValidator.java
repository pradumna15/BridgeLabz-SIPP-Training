package ragesAndJUnit;

public class PinCodeValidator {
    public static boolean isValidPIN(String pin) {
        return pin.matches("^\\d{6}$");
    }

    public static void main(String[] args) {
        System.out.println(isValidPIN("281001")); // true
        System.out.println(isValidPIN("12345"));  // false
    }
}
