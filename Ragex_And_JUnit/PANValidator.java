package ragesAndJUnit;

public class PANValidator {
    public static boolean isValidPAN(String pan) {
        return pan.matches("^[A-Z]{5}\\d{4}[A-Z]$");
    }

    public static void main(String[] args) {
        System.out.println(isValidPAN("ABCDE1234F")); // true
        System.out.println(isValidPAN("abcde1234f")); // false
    }
}
