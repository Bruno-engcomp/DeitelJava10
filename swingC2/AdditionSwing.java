import javax.swing.JOptionPane;

public class AdditionSwing {
    public static void main(String[] args) {
        // Pede para o usuario inserir o numero em formato de string e depois converte para int
        String input = JOptionPane.showInputDialog("Enter the first number:");
        int n1 = Integer.parseInt(input);

        String input2 = JOptionPane.showInputDialog("Enter the second number:");
        int n2 = Integer.parseInt(input2);

        JOptionPane.showMessageDialog(null , "The sum of " + n1 + " and " + n2 + " is " + (n1 + n2));

    }
}
