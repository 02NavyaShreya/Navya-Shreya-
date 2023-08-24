package exercise1;

import java.util.Scanner;

public class SumProduct {
    public static void main(String[] args) {
        int a,b;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        a = obj.nextInt();
        System.out.print("Enter the value of b : ");
        b = obj.nextInt();
        System.out.println("Sum of the values : " + (a+b));
        System.out.println("Product of the values : " + (a*b));
        
    }
    
}
