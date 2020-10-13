
package activity.pkg3;

import java.util.Scanner;
public class Activity3 {


    public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
            System.out.print("Enter celsius: ");
            float A = in.nextFloat();  
            float B = A * (9f / 5) + 32;
            
            System.out.println("Temperature in Fahrenheit is: " + B);
    }
    
}
