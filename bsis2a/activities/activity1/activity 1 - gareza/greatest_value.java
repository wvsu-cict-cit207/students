import java.util.Scanner;
public class greatest_value {
    public static void main (String[] args){
        Scanner gg = new Scanner(System.in);
        int pp;
        int num1,num2,num3;

        System.out.println("enter number 1: ");
        num1 = gg.nextInt();
        System.out.println("enter number 2: ");
        num2 = gg.nextInt();
        System.out.println("enter number 3: ");
        num3 = gg.nextInt();

        pp = (num1>num2)?(num1>num3?num1:num3):(num2>num3 ? num2 :num3);
        System.out.println("number 1 = "+num1);
        System.out.println("number 2 = "+num2);
        System.out.println("number 3 = "+num3);
        System.out.println("the highest number is = "+pp);
    }
}