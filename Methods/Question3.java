import java.util.*;
public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = scanner.nextInt();
        Question3 question3 = new Question3();  
        int handshakes = question3.numberofhandshakes(numberOfStudents);
        System.out.println("Number of handshakes: " + handshakes);

        
    }
    public int numberofhandshakes(int numberOfStudents){
        if (numberOfStudents < 2) {
            return 0; 
        }
        return (numberOfStudents * (numberOfStudents - 1)) / 2; 
    }
    
}
