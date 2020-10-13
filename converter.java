package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in celsius:");
        double c= input.nextDouble();
        double f= (c*9 /5) +32;

        System.out.println("The temperature "+ c + "in celsius is: "+ f + "in farenheit");
        // write your code here
	// write your code here
    }
}
