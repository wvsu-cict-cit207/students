package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter double degree: ");
        double c= input.nextDouble();
        double f= (c*9 /5) +32;

        System.out.print("The Temperature: " +c+ "in Celsius is: "+f+ "in Fahrenheit: ");
    }
}
