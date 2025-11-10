import java.util.Scanner;

public class ValidandoEntrada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        while (n != 1 && n != 2)
        {
            System.out.print("Insira o numero valido: ");
            n = input.nextInt();;
        }
        System.out.print("Parabéns você inseriu o número certo");
    }
}
