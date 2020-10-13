package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);

        System.out.println("\t Temperature Converter\n\t(Celsius to Fahrenheit)");

        System.out.print("Enter the Celsius value:");
        double celsius = scan.nextDouble();

        System.out.println("You have entered: " + celsius + "\u2103");

        /*The temperature T in degrees Fahrenheit (°F) is equal to
        the temperature T in degrees Celsius (°C) times 9/5 plus 32*/
        //F = (C * 9/5)+ 32
        double result = (celsius * 9/5) + 32;

        System.out.print("The converted temperature is " + result + "\u2109");
    }
}
