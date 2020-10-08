import javax.swing.JOptionPane;

public class simpcal {
    public static void main (String[] args){
        double sum,dif,pro,quo,rem;

         float num1 = Float.parseFloat(JOptionPane.showInputDialog("please enter the 1st  number: "));
         float num2 = Float.parseFloat(JOptionPane.showInputDialog("please enter the 2nd number: "));

                sum = num1 + num2;
                dif = num1 - num2;
                pro = num1 * num2;
                quo = num1 / num2;
                rem = num1 % num2;

                JOptionPane.showMessageDialog(null, "this is the SUM = "+sum
                        +"\nthis is the DIFFERENCE  = "+dif
                        +"\nthis is the PRODUCT = "+pro
                        +"\nthis is the QUOTIENT  = "+quo
                        +"\nthis is the REMAINDER = "+rem);
    }
}