package Packs;
import java.util.Scanner;
public class Activity2Calcu {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number ");
        int num2 = sc.nextInt();

        System.out.print("Sum: " + (num1 + num2));
        System.out.print("Product: " + (num1 * num2));
        System.out.print("Difference: " + (num1 - num2));
        System.out.print("Quotient: " + (num1 / num2));
        System.out.print("Remainder: " + (num1 % num2));

    }


}
