package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please Enter The First Number: ");
        int num1 = in.nextInt();
        System.out.println("Please Enter The Second Number: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        int prod = num1 * num2;
        int diff = num1 - num2;
        int quo = num1/num2;
        int remain = num1 % num2;

        System.out.println("The sum of the two numbers is: " +sum+
                "\nThe product of the two numbers is: " +prod+
                "\nThe difference of the two numbers is: " +diff+
                "\nThe quotient of the two numbers is: " +quo+
                "\nThe remainder of the two numbers is: " +remain );

    }
}