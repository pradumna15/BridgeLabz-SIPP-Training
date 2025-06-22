import java.util.Scanner;

public class Question21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3];
        String[] statuses;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();

            data[i][2] = calculateBMI(data[i][0], data[i][1]);
        }

        statuses = getBMIStatuses(data);

        System.out.println("Person\tWeight(kg)\tHeight(cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n", 
                (i + 1), data[i][0], data[i][1], data[i][2], statuses[i]);
        }
    }

    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }

    public static String[] getBMIStatuses(double[][] data) {
        String[] statuses = new String[10];
        for (int i = 0; i < 10; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5)
                statuses[i] = "Underweight";
            else if (bmi < 25)
                statuses[i] = "Normal";
            else if (bmi < 30)
                statuses[i] = "Overweight";
            else
                statuses[i] = "Obese";
        }
        return statuses;
    }
}
