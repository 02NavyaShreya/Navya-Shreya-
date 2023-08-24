package exercise1;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        
        int number;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the value of the number : ");
        number = obj.nextInt();
        if(number==10){System.out.println("Excellent");}
        else if ((number<=9)&&(number>=8)){System.out.println("Very Good");}
        else if ((number<=7)&&(number>=7)){System.out.println("Good");}
        else if ((number<=5)&&(number>=3)){System.out.println("Poor");}
        else if ((number<=2)&&(number>=0)){System.out.println("Very Poor");}
        else{System.out.print("Invalud Entry");}
    }
}
    
