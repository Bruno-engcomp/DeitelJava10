import javax.swing.JOptionPane;

public class AritmeticaSwing {
    public static void main(String[] args) {
        String aux1 = JOptionPane.showInputDialog("Enter the first number:");
        String aux2 = JOptionPane.showInputDialog("Enter the second number:");

        int n1 = Integer.parseInt(aux1);
        int n2 = Integer.parseInt(aux2);

        JOptionPane.showMessageDialog(null, "The sum of " + n1 + " and " + n2 + " is " + (n1 + n2) + "\nThe subtract of " + n1 + " and " + n2 + " is " + (n1 - n2) + "\nThe product of " + n1 + " and " + n2 + " is " + (n1 * n2));\
    }
}
