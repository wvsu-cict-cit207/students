
package greatestvalue;
import java.util.Scanner;
/**
 *
 * @author evely
 */
public class Greatestvalue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1,num2,num3,result,temp;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("number 1: ");
        num1 = scanner.nextInt();
        System.out.print("number 2: ");
        num2 = scanner.nextInt();
        System.out.print("number 3: ");
        num3 = scanner.nextInt();
        
        temp = num1>num2 ? num1:num2;
        result = num3>temp ? num3:temp;
        System.out.print("the highest number is "+result);
        
    }
    
}
