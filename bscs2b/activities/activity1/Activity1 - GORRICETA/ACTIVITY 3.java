package com.company;

public class Main {

    public static void main(String[] args) {
	int number1 = 10;
	int highest = 23;
	int number3 = 5;
	String outcome1 = " ";
	String outcome2 = " ";
	String outcome3 = " ";

		System.out.println("number 1 = "+ number1);
	System.out.println("number 2 = "+ highest);
	System.out.println("number 3 = "+ number3);

	outcome1 = (number1 >= highest)? "True" : "False";
	outcome2 = (number3 >= highest)? "True" : "False";
	outcome3 = (outcome1 == outcome2)? "The highest number is 23" : "false";

	System.out.println(outcome3);




    }
}
