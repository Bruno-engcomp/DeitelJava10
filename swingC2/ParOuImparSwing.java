import javax.swing.JOptionPane;

public class ParOuImparSwing {
    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog("Enter a number:");
        int n = Integer.parseInt(aux);
        if (n % 2 == 0)
            JOptionPane.showMessageDialog(null, "The number " + n + " is even");
        else
            JOptionPane.showMessageDialog(null, "The number " + n + " is odd");

    }
}
