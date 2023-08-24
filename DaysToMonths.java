package exercise1;
import java.util.Scanner;
public class DaysToMonths {
    public static void main(String[] args) {
        //number of days intomonths and days
        int days;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of Days : ");
        days = obj.nextInt();
        int months,RDays;
        months = days / 30;
        System.out.print( months +" Months ");
        RDays = days - (months*30);
        System.out.println( RDays +" Days");
    }   
}
