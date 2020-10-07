package Packs;

import java.util.Scanner;

public class Act1Ave {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double number1 = 10;
        System.out.println("number1 = " + number1);
        double number2 = 20;
        System.out.println("number2 = " + number2);
        double number3 = 45;
        System.out.println("number3 = " + number3);
        System.out.print("The Average value of the numbers is: " + average(number1, number2, number3));
    }

    public static double average(double number1, double number2, double number3) {
        return (number1 + number2 + number3) / 3;
    }
}
