
package activity.pkg2;

import java.util.Scanner;
public class Activity2 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
       System.out.print("Enter 1st number: ");
       int a = in.nextInt();
       System.out.print("Enter 2nd number: ");
       int b = in.nextInt();
       
       int sum  = a + b;  
       int diff = a - b;
       int pro 	= a * b;
       int quo	= a / b;
       int rem  = a % b;
       
       System.out.println("Sum : " + sum);
       System.out.println("Difference : " + diff);
       System.out.println("Product : " + pro);
       System.out.println("Quotient : " + quo);
       System.out.println("Remainder: " + rem);

    }
    
}
