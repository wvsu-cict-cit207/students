package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);

        System.out.println("Mini Calculator\n");

        System.out.print("Enter the first number: ");
        double num1 = scan.nextDouble();
        System.out.print("Enter the first number: ");
        double num2 = scan.nextDouble();

        System.out.print("\n");

        System.out.println("The Sum are: " + (num1 + num2));
        System.out.println("The Difference are: " + (num1 - num2));
        System.out.println("The Product are: " + (num1 * num2));
        System.out.println("The Quotient are: " + (num1 / num2));
        System.out.println("The Modulo are: " + (num1 % num2));

    }
}
