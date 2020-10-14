import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class ConvertTempBuffered {
    
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            System.out.print("Enter number to be converted: ");

        String input = br.readLine();

        double num = Double.parseDouble(input);
        double converted = (num * 9/5) + 32;

        System.out.println("Celcius: " + num);
        System.out.println("Fahrenheit: " + converted);
        }
        catch (IOException e){
            
        }


    }
}
