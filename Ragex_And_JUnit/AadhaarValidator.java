package ragesAndJUnit;

public class AadhaarValidator {
    public static boolean isValidAadhaar(String aadhaar) {
        return aadhaar.matches("^\\d{12}$");
    }

    public static void main(String[] args) {
        System.out.println(isValidAadhaar("123412341234")); // true
        System.out.println(isValidAadhaar("12345678"));      // false
    }
}
