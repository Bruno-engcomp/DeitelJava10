import java.util.Scanner;

public class CalculandoVendas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double vt = 0; // vp = valor total da soma de todos os produtos vendidos
        int quant, np; // quant = quantidade de produtos vendidos e np = numero do produto

        System.out.println("Escolha numeros produtos de 1 a 5 para adicionar ao carrinho");
        System.out.println("Se desejar para digite 0");

        while(true)
        {
            System.out.print("Digite o numero do produto que deseja: ");
            np = input.nextInt();

            if (np == 0)
                break;

            System.out.print("Quantia desejada: ");
            quant = input.nextInt();

            double price;
                switch (np)
                {
                    case 1:
                        price = 2.98;
                        break;
                    case 2:
                        price = 4.50;
                        break;
                    case 3:
                        price = 9.98;
                        break;
                    case 4:
                        price = 4.49;
                        break;
                    case 5:
                        price = 6.87;
                        break;
                    default:
                        System.out.println("Valor invalido");
                        continue;

                }
            vt += price * quant;
            System.out.printf("Subtotal do produto = R$%f%n", price * quant);
        }
        System.out.printf("Total = R$%f", vt);
    }
}
