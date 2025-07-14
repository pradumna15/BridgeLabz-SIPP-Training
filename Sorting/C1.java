import java.util.*;

public class Main {
    public static void countingSort(int[] ages) {
        int max = 18;
        int min = 10;
        int range = max - min + 1;

        int[] count = new int[range];
        int[] output = new int[ages.length];

        for (int age : ages)
            count[age - min]++;

        for (int i = 1; i < range; i++)
            count[i] += count[i - 1];

        for (int i = ages.length - 1; i >= 0; i--) {
            output[count[ages[i] - min] - 1] = ages[i];
            count[ages[i] - min]--;
        }

        for (int i = 0; i < ages.length; i++)
            ages[i] = output[i];
    }

    public static void main(String[] args) {
        int[] studentAges = {13, 17, 11, 14, 10, 18, 12, 13, 15};
        countingSort(studentAges);
        System.out.println("Sorted Student Ages:");
        for (int age : studentAges) {
            System.out.print(age + " ");
        }
    }
}
