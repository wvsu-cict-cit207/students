import java.util.Scanner;


public class UserInput {

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter two numbers to compute: ");
        String input = scanner.nextLine();
        String input1 = scanner.nextLine();

        int num = Integer.parseInt(input);
        int num1 = Integer.parseInt(input1);


        System.out.println("Sum = " + (num+num1));
        System.out.println("Product = " + (num*num1));
        System.out.println("Difference = " + (num-num1));
        System.out.println("Quotient = " + (num/num1));
        System.out.println("Remainder = " + (num%num1));
    }
}