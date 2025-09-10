package ragesAndJUnit;

public class DateValidator {
    public static boolean isValidDate(String date) {
        return date.matches("^\\d{4}-\\d{2}-\\d{2}$");
    }

    public static void main(String[] args) {
        System.out.println(isValidDate("2025-08-09")); // true
        System.out.println(isValidDate("09-08-2025")); // false
    }
}
