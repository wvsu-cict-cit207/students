
package calculatoract;

import java.util.Scanner;

public class CalculatorAct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj= new Scanner (System.in);
        
        double sum, diff, pro, quo, rem;
        
        System.out.println("enter first number:");
        double num1= obj.nextInt();
        System.out.println("enter first number:");
        double num2= obj.nextInt();
        
        sum=num1+num2;
        diff=num1-num2;
        pro=num1*num2;
        quo=num1/num2;
        rem=num1%num2;
        
        
        System.out.println("the sum is   " +sum);
        System.out.println("the diffirence is   " +diff);
        System.out.println("the product is   " +pro);
        System.out.println("the quotient is   " +quo);
        System.out.println("the remainder is   " +rem);
        
        
    }
    
}
