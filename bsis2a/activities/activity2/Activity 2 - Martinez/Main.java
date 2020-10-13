package task;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String num1;
	String num2;



	try {
	    System.out.print("Enter your first number: ");
	    num1 = br.readLine();

	    System.out.print("Enter your second number: ");
	    num2 = br.readLine();

	    int num1int = Integer.parseInt(num1);
	    int num2int = Integer.parseInt(num2);

	    System.out.println("Results of the given numbers: ");
        System.out.println("Sum: " + num1int + num2int);
        System.out.println("Difference: " + (num1int - num2int));
        System.out.println("Product: " + num1int * num2int);
        System.out.println("Quotient: " + num1int / num2int);
        System.out.println("Remainder: " + num1int % num2int);





    }catch (IOException e){
		e.printStackTrace();
	}





    }
}
