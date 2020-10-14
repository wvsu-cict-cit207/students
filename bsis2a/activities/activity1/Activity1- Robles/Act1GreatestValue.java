package Packs;
import java.util.Scanner;
public class Act1GreatestValue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = 10;
        System.out.println("number 1 = " +num1);
        int num2 = 23;
        System.out.println("number 2 = "+ num2);
        int num3 = 5;
        System.out.println("number 3 = "+ num3);


        int store = num1>num2 ? num1:num2;
        int result = num3>store ? num3:store;
        System.out.println("The Highest Number is: "+result);

    }
    }


