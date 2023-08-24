package exercise1;
import java.util.Scanner;
public class MinCommandLineArg {
    public static void main(String[] args) {
        int a,b;
        Scanner obj = new Scanner(System.in);
        a = Integer.parseInt(args[0]);
        System.out.println("Value of A is " + a);
        b = Integer.parseInt(args[1]);
        System.out.println("Value of B is " + b);
        if(a<b){System.out.print("A is Minimum");}        
        else{System.out.println("B is minimum");}
        obj.close();
       
    }
}


   
