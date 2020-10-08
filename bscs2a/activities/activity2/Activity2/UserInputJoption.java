import javax.swing.JOptionPane;

public class UserInputJoption {

    public static void main(String[] args) {
        
        String input1 = JOptionPane.showInputDialog("Enter first number");
        String input2 = JOptionPane.showInputDialog("Enter second number");

        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);

        int sum = num1 + num2;
        int prod = num1 * num2;
        int dif = num1 - num2;
        int quotient = num1 / num2;
        int rem = num1 % num2;


        JOptionPane.showMessageDialog(null,"Sum:" + sum);
        JOptionPane.showMessageDialog(null,"Product:" + prod);
        JOptionPane.showMessageDialog(null,"Difference:" + dif);
        JOptionPane.showMessageDialog(null,"Quotient:" + quotient);
        JOptionPane.showMessageDialog(null,"Remainder:" + rem);

    }
}