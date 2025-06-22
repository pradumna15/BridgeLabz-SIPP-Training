import java.util.*;
public class Question33 {
     public static void main(String[] args) {
        int month = 7, year = 2005;
        printCalendar(month, year);
    }

    static void printCalendar(int month, int year) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", 
                           "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int[] days = {31, 28, 31, 30, 31, 30, 
                      31, 31, 30, 31, 30, 31};

        if (isLeapYear(year)) days[1] = 29;

        System.out.println("\n\t" + months[month - 1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int start = getStartDay(month, year);
        for (int i = 0; i < start; i++) System.out.print("    ");

        for (int i = 1; i <= days[month - 1]; i++) {
            System.out.printf("%3d ", i);
            if ((i + start) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    static int getStartDay(int month, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m) / 12) % 7;
    }
}
