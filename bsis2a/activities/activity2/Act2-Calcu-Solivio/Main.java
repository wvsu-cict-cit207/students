package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int no1 = input.nextInt();
        System.out.print("Enter second number: ");
        int no2 = input.nextInt();

        System.out.printf("Sum of the two numbers: %d%n", no1 + no2);
        System.out.printf("Difference of the two numbers: %d%n", no1 - no2);
        System.out.printf("Product of the two numbers: %d%n", no1 * no2);
        System.out.printf("Quotient of the two numbers: %d%n", no1 / no2);
        System.out.printf("Remainder of the two numbers: %d%n", no1 % no2);

    }
}
