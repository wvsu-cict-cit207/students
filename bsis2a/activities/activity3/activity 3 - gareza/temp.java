import java.util.Scanner;

public class temp {
    public static void main (String[] args){
        Scanner pp = new Scanner(System.in);

        System.out.println("enter a temperature in celsius: ");
        double cel = pp.nextDouble();

        double far = cel * 1.8 + 32;
        System.out.println("the value of "+cel+" in FAHRENHEIT is equal to = "+far);
    }
}
