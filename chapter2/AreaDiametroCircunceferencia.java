import java.util.Scanner;
public class AreaDiametroCircunceferencia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o raio da circunferencia:");
        float r = input.nextFloat();

        double circunferencia = 2 * Math.PI * r;
        double area = Math.PI * r * r;
        float diametro = 2 * r;

        System.out.println("A área do círculo é " + area);
        System.out.println("O comprimento da circunferência é " + circunferencia);
        System.out.println("O diamêtro é " + diametro);
    }
}
