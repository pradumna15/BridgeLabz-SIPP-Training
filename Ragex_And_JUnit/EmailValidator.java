package ragesAndJUnit;

public class EmailValidator {
    public static boolean isValidEmail(String email) {
        return email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
    }

    public static void main(String[] args) {
        System.out.println(isValidEmail("test@example.com")); // true
        System.out.println(isValidEmail("invalid@.com"));     // false
    }
}

