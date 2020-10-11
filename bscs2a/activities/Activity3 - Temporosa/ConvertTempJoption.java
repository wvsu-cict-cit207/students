import javax.swing.JOptionPane;

public class ConvertTempJoption {
   
    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Enter number to be converted: ");

        double num = Double.parseDouble(input);
        double converted = (num * 9/5) + 32;
        
        JOptionPane.showMessageDialog(null,"Celsius: " + num);
        JOptionPane.showMessageDialog(null,"Fahrenheit: " + converted);

    }
}
