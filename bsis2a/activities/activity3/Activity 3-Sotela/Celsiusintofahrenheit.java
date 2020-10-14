
package celsiusintofahrenheit;
import java.util.Scanner;
/**
 *
 * @author evely
 */
public class Celsiusintofahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float fahrenheit,celsius;
        Scanner scanner = new Scanner (System.in);
        System.out.print("enter your temperature in celsius:");
        celsius = scanner.nextFloat();
        fahrenheit= ((celsius*9)/5)+32;
        System.out.println("temperature in Fahrenheit is: "+fahrenheit);
      
    }
    
}
