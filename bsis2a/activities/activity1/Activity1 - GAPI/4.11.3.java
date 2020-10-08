package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);


        System.out.print("Enter first number:");
        int a = input.nextInt();
        System.out.print("Enter second number:");
        int b = input.nextInt();
        System.out.print("Enter third number:");
        int c = input.nextInt();

        int result = (a > b) ? (a > c ? a : c): (b > c ? b: c);
        System.out.print("The greatest value is: " + result);


	// write your code  here
    }
}
