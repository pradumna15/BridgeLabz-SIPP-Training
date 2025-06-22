import java.util.*;

public class Question31 {
    public static void main(String[] args) {
        String[] otps = new String[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        System.out.println("Are all OTPs unique? " + areOTPsUnique(otps));
    }

    static String generateOTP() {
        Random rand = new Random();
        int otp = 100000 + rand.nextInt(900000); // Ensure 6-digit
        return String.valueOf(otp);
    }

    static boolean areOTPsUnique(String[] otps) {
        Set<String> set = new HashSet<>(Arrays.asList(otps));
        return set.size() == otps.length;
    }
}
