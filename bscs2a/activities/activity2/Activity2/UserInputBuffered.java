import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputBuffered {
    
    public static void main(String[] args) {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.print("Enter first number: ");
            String input1 = input.readLine();
            System.out.print("Enter second number: ");
            String input2 = input.readLine();

            int num1 = Integer.parseInt(input1);
            int num2 = Integer.parseInt(input2);

            System.out.println("Sum = " + (num1+num2));
            System.out.println("Product = " + (num1*num2));
            System.out.println("Difference = " + (num1-num2));
            System.out.println("Quotient = " + (num1/num2));
            System.out.println("Remainder = " + (num1%num2));

        } 
        catch(IOException e){

        };
    }
}
