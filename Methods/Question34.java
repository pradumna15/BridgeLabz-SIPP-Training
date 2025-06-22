import java.util.*;

public class Question34 {
     public static void main(String[] args) {
        int number = 12021;
        int[] digits = getDigits(number);
        System.out.println("Palindrome: " + isPalindrome(digits));
        System.out.println("Duck Number: " + isDuck(digits));
    }

    static int[] getDigits(int n) {
        String str = Integer.toString(n);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++)
            digits[i] = str.charAt(i) - '0';
        return digits;
    }

    static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return Arrays.equals(digits, reversed);
    }

    static int[] reverseArray(int[] digits) {
        int[] rev = new int[digits.length];
        for (int i = 0; i < digits.length; i++)
            rev[i] = digits[digits.length - 1 - i];
        return rev;
    }

    static boolean isDuck(int[] digits) {
        for (int i = 1; i < digits.length; i++)
            if (digits[i] == 0) return true;
        return false;
    }
}
