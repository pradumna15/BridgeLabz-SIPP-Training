public class Question36 {
    public static void main(String[] args) {
        int x1 = 2, y1 = 3, x2 = 6, y2 = 7;
        System.out.println("Distance: " + distance(x1, y1, x2, y2));
        double[] eq = lineEquation(x1, y1, x2, y2);
        System.out.printf("Line Equation: y = %.2fx + %.2f\n", eq[0], eq[1]);
    }

    static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    static double[] lineEquation(int x1, int y1, int x2, int y2) {
        double m = (double)(y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        return new double[]{m, b};
    }
}
