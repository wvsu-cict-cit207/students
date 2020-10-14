import javax.swing.*;
public class Act2JO {
    public static void main(String[] args) {
        double grade = Double.parseDouble(JOptionPane.showInputDialog("Enter grade"));
                    //boolean exp
        String msg = grade >= 75 ? "Passed" : "Failed";
        JOptionPane.showMessageDialog(null, "You " + msg);
    }
}
