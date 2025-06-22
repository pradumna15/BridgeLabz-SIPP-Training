import java.util.Scanner;

public class Question8 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive natural number.");
        } else {
            int sum = sumOfNaturalNumbers(n);
            System.out.println("The sum of first " + n + " natural numbers is: " + sum);
        }
    }
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    
    
    
}
