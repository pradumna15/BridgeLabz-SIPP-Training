package ragesAndJUnit;

public class PhoneValidator {
    public static boolean isValidIndianPhone(String phone) {
        return phone.matches("^[6-9]\\d{9}$");
    }

    public static void main(String[] args) {
        System.out.println(isValidIndianPhone("9876543210")); // true
        System.out.println(isValidIndianPhone("1234567890")); // false
    }
}
