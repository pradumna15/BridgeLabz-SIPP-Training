import java.util.*;

public class   Question26 {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random random = new Random();

        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + random.nextInt(101);
        }

        int sum = getSum(heights);
        double mean = getMean(heights);
        int min = getMin(heights);
        int max = getMax(heights);

        System.out.println("Heights: " + Arrays.toString(heights));
        System.out.println("Mean Height: " + mean);
        System.out.println("Shortest Height: " + min);
        System.out.println("Tallest Height: " + max);
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    public static double getMean(int[] arr) {
        return (double) getSum(arr) / arr.length;
    }

    public static int getMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int value : arr) {
            if (value < min) min = value;
        }
        return min;
    }

    public static int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int value : arr) {
            if (value > max) max = value;
        }
        return max;
    }
}