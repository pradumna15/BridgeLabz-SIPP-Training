import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        
    
     Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total number of chocolates: ");
        int chocolates = scanner.nextInt();

        System.out.print("Enter number of children: ");
        int children = scanner.nextInt();

        if (children <= 0) {
            System.out.println("Number of children must be greater than zero.");
            return;
        }

        int[] result = findRemainderAndQuotient(chocolates, children);

        System.out.println("Each child will get " + result[0] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[1]);
    }
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    
    
}
