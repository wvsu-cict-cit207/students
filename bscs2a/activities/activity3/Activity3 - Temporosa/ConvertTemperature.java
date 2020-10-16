//scanner
import java.util.Scanner;

public class ConvertTemperature {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to be converted: ");
        String input = scanner.nextLine();

        double num = Double.parseDouble(input);
        double converted = (num * 9/5) + 32;

        System.out.println("Celcius: " + num);
        System.out.println("Fahrenheit: " + converted);


    }
}