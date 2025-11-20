import java.util.Scanner;

public class LosanguloNlado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o tamanho do lado do losangulo: ");
        int n = input.nextInt();
        n--;

        for(int i = 0; i < n; i++)
        {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i*2)+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i >= 0; i--)
        {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i*2)+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
