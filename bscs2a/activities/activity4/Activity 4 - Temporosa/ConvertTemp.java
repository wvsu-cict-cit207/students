//converion of both temperature using scanner

import java.util.Scanner;

public class ConvertTemp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Options");
        System.out.println("1. Celcius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celcius");

        System.out.print("Enter option: ");
        int value = Integer.parseInt(scanner.nextLine());

        switch (value) {
            case 1:
                System.out.print("Enter number to convert:");
                float num = Float.parseFloat(scanner.nextLine());
                float convert = (num * 9/5) + 32;
                System.out.print(num + "\u00B0 celcius = " + convert + "\u00B0 fahrenheit");
                break;
            
            case 2:
                System.out.print("Enter number to convert:");
                float num1 = Float.parseFloat(scanner.nextLine());
                float convert1 = (num1 - 32) * 5/9;
                System.out.print(num1 + "\u00B0 fahrenheit = " + convert1 + "\u00B0 celcius");
                break;
        
            default:
                System.out.print("Cannot convert");
                break;
        }

    }
    
}