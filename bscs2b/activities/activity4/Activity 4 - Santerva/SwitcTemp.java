
package main;
    import java.util.Scanner;

public class SwitcTemp {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("1- CelsiusToFahrenhiet 2- FahrenhietToCelsius");
        System.out.println("Enter Number: \n");
        int num1 = in.nextInt();
        
        switch(num1){
            case 1:
                System.out.print("Enter temperature : ");
                double C = in.nextDouble();
        
                /* Convert Celsius to Fahrenheit */
                double F = C * (9f / 5) + 32;
        
                /* Print result */
                System.out.println(C + " degree Celsius is equal to " + F +" degree Fahrenheit.");
                break;
            case 2:
                System.out.print("Enter temperature : ");
                double f = in.nextDouble();
                
                /*Convert Fahrenheit to Celsius */
                double c = (( 5 *(f - 32.0)) / 9.0);
                
                System.out.println(f + " degree Fahrenheit is equal to " + c +" degree Celsius.");
                
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
    
}
