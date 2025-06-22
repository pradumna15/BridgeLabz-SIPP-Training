import java.util.*;

public class Question32 {
     public static void main(String[] args) {
        int n = 5;
        int[][] scores = generateRandomScores(n);
        double[][] results = calculateResults(scores);
        displayScoreCard(scores, results);
    }

    static int[][] generateRandomScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3]; // PCM
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                scores[i][j] = 50 + rand.nextInt(51); // 2-digit scores
        return scores;
    }

    static double[][] calculateResults(int[][] scores) {
        double[][] result = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;
            result[i][0] = total;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return result;
    }

    static void displayScoreCard(int[][] scores, double[][] results) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPercent");
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < 3; j++) System.out.print(scores[i][j] + "\t");
            System.out.println((int)results[i][0] + "\t" + results[i][1] + "\t" + results[i][2]);
        }
    }
}
