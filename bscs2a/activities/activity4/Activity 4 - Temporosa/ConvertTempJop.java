//conversion of both temperatures using JOption

import javax.swing.JOptionPane;

public class ConvertTempJop {
    
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,"Options: \n1. Celcius to Fahrenheit \n2. Fahrenheit to Celcius");
        int input = Integer.parseInt (JOptionPane.showInputDialog("Enter Option"));
        
        switch(input){
            case 1:
            float num = Float.parseFloat(JOptionPane.showInputDialog("Enter Value: "));
            float convert = (num * 9/5) + 32;
            JOptionPane.showMessageDialog(null, num + "\u00B0 celcius = " + convert + "\u00B0 fahrenheit");
            break;
            case 2:
            float num1 = Float.parseFloat(JOptionPane.showInputDialog("Enter Value: "));
            float convert1 = (num1 - 32) * 5/9;
            JOptionPane.showMessageDialog(null, num1 + "\u00B0 fahrenheit = " + convert1 + "\u00B0 celcius");
            break;
            default:
            JOptionPane.showMessageDialog(null,"Cannot convert");
            break;
        }
        
    }
}
