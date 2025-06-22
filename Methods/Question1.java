import java.util.*;
class Question1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int days=sc.nextInt();
        int months=sc.nextInt();
        boolean result=springseason(days, months);
        if(result){
            System.out.println("Spring Season");
        } else {
            System.out.println("Not Spring Season");
        }
    }
    public static boolean springseason(int days,int month){
        if(month==3 && days>=20 || month==4 || month==5 || month==6 && days<21){
            return true;
        }
        return false;
    }
}