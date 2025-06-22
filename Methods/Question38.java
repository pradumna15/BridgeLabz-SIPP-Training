import java.util.*;

public class Question38 {
     public static void main(String[] args) {
        int[][] matrix2x2 = generateMatrix(2, 2);
        int[][] matrix3x3 = generateMatrix(3, 3);

        displayMatrix("2x2 Matrix", matrix2x2);
        displayMatrix("Transpose", transpose(matrix2x2));
        System.out.println("Determinant 2x2: " + determinant2x2(matrix2x2));
        displayMatrix("Inverse 2x2", inverse2x2(matrix2x2));

        displayMatrix("3x3 Matrix", matrix3x3);
        System.out.println("Determinant 3x3: " + determinant3x3(matrix3x3));
        displayMatrix("Transpose", transpose(matrix3x3));
        displayMatrix("Inverse 3x3", inverse3x3(matrix3x3));
    }

    static int[][] generateMatrix(int r, int c) {
        Random rand = new Random();
        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                matrix[i][j] = rand.nextInt(10) + 1;
        return matrix;
    }

    static int[][] transpose(int[][] matrix) {
        int[][] trans = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                trans[j][i] = matrix[i][j];
        return trans;
    }

    static double determinant2x2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    static double[][] inverse2x2(int[][] m) {
        double det = determinant2x2(m);
        if (det == 0) return new double[2][2];
        return new double[][]{
            { m[1][1] / det, -m[0][1] / det },
            { -m[1][0] / det, m[0][0] / det }
        };
    }

    static int determinant3x3(int[][] m) {
        return m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1]) -
               m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0]) +
               m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    static double[][] inverse3x3(int[][] m) {
        double det = determinant3x3(m);
        if (det == 0) return new double[3][3];
        double[][] adj = new double[3][3];
        adj[0][0] =  m[1][1]*m[2][2] - m[1][2]*m[2][1];
        adj[0][1] = -1 * (m[1][0]*m[2][2] - m[1][2]*m[2][0]);
        adj[0][2] =  m[1][0]*m[2][1] - m[1][1]*m[2][0];

        adj[1][0] = -1 * (m[0][1]*m[2][2] - m[0][2]*m[2][1]);
        adj[1][1] =  m[0][0]*m[2][2] - m[0][2]*m[2][0];
        adj[1][2] = -1 * (m[0][0]*m[2][1] - m[0][1]*m[2][0]);

        adj[2][0] =  m[0][1]*m[1][2] - m[0][2]*m[1][1];
        adj[2][1] = -1 * (m[0][0]*m[1][2] - m[0][2]*m[1][0]);
        adj[2][2] =  m[0][0]*m[1][1] - m[0][1]*m[1][0];

        double[][] inv = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                inv[i][j] = adj[i][j] / det;

        return inv;
    }

    static void displayMatrix(String label, double[][] matrix) {
        System.out.println(label + ":");
        for (double[] row : matrix) {
            for (double val : row)
                System.out.printf("%8.2f", val);
            System.out.println();
        }
        System.out.println();
    }

    static void displayMatrix(String label, int[][] matrix) {
        System.out.println(label + ":");
        for (int[] row : matrix) {
            for (int val : row)
                System.out.printf("%5d", val);
            System.out.println();
        }
        System.out.println();
    }
}
