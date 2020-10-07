package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                Scanner obj = new Scanner(System.in);

                double sum, diff, pro, quo, rem;

                System.out.print("Enter the first number: ");
                double num1 = obj.nextInt();
                System.out.print("Enter the second number: ");
                double num2 = obj.nextInt();
                sum = num1 + num2;
                diff = num1 - num2;
                pro = num1 * num2;
                quo = num1 / num2;
                rem = num1 % num2;

                System.out.print("The sum is = " + sum);
                System.out.print("The diff is = " + diff);
                System.out.print("The pro is = " + pro);
                System.out.print("The quo is = " + quo);
                System.out.print("The rem is = " + rem);
            }
        }
