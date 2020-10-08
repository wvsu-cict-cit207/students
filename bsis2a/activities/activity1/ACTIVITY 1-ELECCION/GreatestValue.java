
package greatestvalue;

import java.util.Scanner;

public class GreatestValue {

 
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int value;
        int num1, num2, num3;
        
        System.out.print("Enter number 1:");
        num1 = input.nextInt();
        
        System.out.print("Enter number 2:");
        num2 = input.nextInt();
        
        System.out.print("Enter number 3:");
        num3 = input.nextInt();
        
        value= (num1>num2)? (num1>num3?num1:num3): (num2>num3 ? num2:num3);
        
        System.out.println("number 1= "+ num1);
        System.out.println("number 2= "+ num2);
        System.out.println("number 3= "+ num3);
        System.out.println("the highest number is:"+ value);
    }
    
}
