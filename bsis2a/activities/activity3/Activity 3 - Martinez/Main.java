package task;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        double celsius = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter temperature in celsius: "));

        double farenheit = (celsius * 9 / 5) + 32;

        JOptionPane.showMessageDialog(null, celsius + "°C = " + farenheit + "°F");





    }
}
