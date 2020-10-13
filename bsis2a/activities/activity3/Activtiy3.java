package Packs;

import java.util.Scanner;

public class Activtiy3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in celsius:");
        double C = input.nextDouble();
        double F = (9.0 / 5.0) * C + 32;

        System.out.println("Temperature in Celsius: " + C);
        System.out.println("Convert to Fahrenheit : " + F);

    }
}
