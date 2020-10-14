import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Act2BR {
    public static void main(String[] args) {
        //create an object of BR - why do we need to create an object???
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter first number: ");
            String strNum1 = br.readLine();
            System.out.println("Enter second number: ");
            String strNum2 = br.readLine();

            int num1 = Integer.parseInt(strNum1);
            int num2 = Integer.parseInt(strNum2);

            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}