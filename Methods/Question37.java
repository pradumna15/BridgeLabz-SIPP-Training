import java.util.*;

public class Question37 {
    public static void main(String[] args) {
        int[][] empData = generateEmployeeData(10);
        double[][] bonusData = calculateBonuses(empData);
        displayBonusTable(empData, bonusData);
    }

    static int[][] generateEmployeeData(int n) {
        Random rand = new Random();
        int[][] data = new int[n][2]; // [salary, years]
        for (int i = 0; i < n; i++) {
            data[i][0] = 10000 + rand.nextInt(90000); // 5-digit salary
            data[i][1] = 1 + rand.nextInt(10);         // 1-10 years
        }
        return data;
    }

    static double[][] calculateBonuses(int[][] data) {
        double[][] result = new double[data.length][2]; // [bonus, new salary]
        for (int i = 0; i < data.length; i++) {
            double bonus = data[i][1] > 5 ? 0.05 * data[i][0] : 0.02 * data[i][0];
            result[i][0] = Math.round(bonus * 100.0) / 100.0;
            result[i][1] = data[i][0] + result[i][0];
        }
        return result;
    }

    static void displayBonusTable(int[][] data, double[][] result) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        System.out.println("Salary\tYears\tBonus\tNew Salary");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%d\t%d\t%.2f\t%.2f\n", data[i][0], data[i][1], result[i][0], result[i][1]);
            totalOld += data[i][0];
            totalNew += result[i][1];
            totalBonus += result[i][0];
        }
        System.out.printf("\nTotal Old Salary: %.2f\nTotal New Salary: %.2f\nTotal Bonus: %.2f\n", totalOld, totalNew, totalBonus);
    }
}
