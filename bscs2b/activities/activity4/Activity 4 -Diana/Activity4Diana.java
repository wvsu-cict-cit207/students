
package activity.pkg4.diana;


import java.util.Scanner;
public class Activity4Diana {


    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
       
            float a, b;
   
            System.out.print("Choose between Celsius (1) or Fahrenheit (2)? ");
            int A = in.nextInt();
            
            switch (A) {
                case 1 :System.out.println("Enter fahrenheit temperature: ");
                   	    a=in.nextFloat();
                            b=(a-32)*5/9;
                        System.out.println("Celsius temperature is " + b);
                        break;
                case 2 :System.out.println("Enter celsius temperature: ");
                   	    b = in.nextFloat();
                            a = ((9*b)/5)+32;
                        System.out.println("Fahrenheit temperature is " + a);
                        break;
                default : System.out.println("Are you dumb?");
                        break;               
            }


    }
    
}
