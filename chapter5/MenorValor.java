import java.util.Scanner;

public class MenorValor {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int valor, menor;
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        System.out.print("Enter the 1 number: ");
        menor = input.nextInt();

        for(int i = 2; i <= n; i++)
        {
            System.out.printf("Enter the %d number: ", i);
            valor = input.nextInt();
            if(valor < menor)
            {
                menor = valor;
            }
        }
        System.out.printf("The smallest number is %d", menor);
    }
}
