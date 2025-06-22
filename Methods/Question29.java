public class Question29 {
    public static void main(String[] args) {
        int number = 21;
        int[] digits = getDigits(number);
        System.out.println("Digit Count: " + digits.length);
        System.out.println("Sum of Digits: " + sumOfDigits(digits));
        System.out.println("Sum of Squares: " + sumOfSquares(digits));
        System.out.println("Is Harshad: " + isHarshad(number, digits));
        displayDigitFrequency(digits);
    }

    static int[] getDigits(int n) {
        String str = Integer.toString(n);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++)
            digits[i] = str.charAt(i) - '0';
        return digits;
    }

    static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    static boolean isHarshad(int n, int[] digits) {
        return n % sumOfDigits(digits) == 0;
    }

    static void displayDigitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digits) freq[d][1]++;
        for (int[] row : freq)
            if (row[1] > 0) System.out.println("Digit: " + row[0] + ", Frequency: " + row[1]);
    }
}
