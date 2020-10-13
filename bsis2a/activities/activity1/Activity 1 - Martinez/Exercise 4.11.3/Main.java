package task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int a = 10;
	int b = 23;
	int c = 5;

	int highest;

	highest = (a>b?a>c?a:c:b>c?b:c);

	System.out.println("number 1 = " + a);
	System.out.println("number 2 = " + b);
	System.out.println("number 3 = " + c);
	System.out.println("the highest number is = " + highest);


    }
}
