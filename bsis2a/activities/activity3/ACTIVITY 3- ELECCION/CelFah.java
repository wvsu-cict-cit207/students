
package celfah;

import java.util.Scanner;


public class CelFah {

    
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       
       System.out.print("Enter a degree in celsius: ");
       double c= input.nextDouble();
       double f= (90.5)* c+32;
       
       System.out.print("The temperature "  + c + " in celsius " + f + " in fahrenheit ");
               
    }
    
}
