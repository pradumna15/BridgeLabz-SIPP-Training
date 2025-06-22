public class Question35 {
      public static void main(String[] args) {
        int number = 12;
        int[] factors = findFactors(number);
        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + productOfCubes(factors));
    }

    static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) count++;
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) factors[index++] = i;
        return factors;
    }

    static int greatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    static int productOfFactors(int[] factors) {
        int product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    static double productOfCubes(int[] factors) {
        double product = 1;
        for (int f : factors)
            product *= Math.pow(f, 3);
        return product;
    }
    
}
