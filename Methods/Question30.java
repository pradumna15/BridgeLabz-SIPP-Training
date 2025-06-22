import java.util.Random;

public class Question30 {
     public static void main(String[] args) {
        int[][] m1 = generateMatrix(2, 2);
        int[][] m2 = generateMatrix(2, 2);

        displayMatrix("Matrix 1", m1);
        displayMatrix("Matrix 2", m2);
        displayMatrix("Sum", addMatrices(m1, m2));
        displayMatrix("Difference", subtractMatrices(m1, m2));
        displayMatrix("Product", multiplyMatrices(m1, m2));
    }

    static int[][] generateMatrix(int r, int c) {
        Random rand = new Random();
        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                matrix[i][j] = rand.nextInt(10);
        return matrix;
    }

    static int[][] addMatrices(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < res.length; i++)
            for (int j = 0; j < res[0].length; j++)
                res[i][j] = a[i][j] + b[i][j];
        return res;
    }

    static int[][] subtractMatrices(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < res.length; i++)
            for (int j = 0; j < res[0].length; j++)
                res[i][j] = a[i][j] - b[i][j];
        return res;
    }

    static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int[][] res = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b[0].length; j++)
                for (int k = 0; k < a[0].length; k++)
                    res[i][j] += a[i][k] * b[k][j];
        return res;
    }

    static void displayMatrix(String name, int[][] matrix) {
        System.out.println(name + ":");
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
        System.out.println();
    }
    
}
