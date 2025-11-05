import java.util.Scanner;
public class Quilometragem {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int kmTotal = 0;
        int lTotal = 0;
        int x = 0;

        while (x != -1)
        {
            System.out.print("Digite a quantidade de kilometros percorridos nessa viagem:");
            kmTotal += input.nextInt();

            System.out.print("Digite a quantidade de litros gastos nessa viagem:");
            lTotal += input.nextInt();

            System.out.print("Deseja parar? Digite {-1}: ");
            x = input.nextInt();
        }
        System.out.printf("A quantidade total de kilometros percorridos foi %d%n", kmTotal);
        System.out.printf("A quantidade total de litros gastos foi %d%n", lTotal);
    }
}
