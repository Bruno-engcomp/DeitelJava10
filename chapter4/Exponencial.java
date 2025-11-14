import java.util.Scanner;

public class Exponencial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number:");
        int n = input.nextInt();

        double e, result = 1;
        double f = 1;

        for (int i = 1; i < 10; i++)
        {
            e = Math.pow(n, i);
            f *= i;
            result += e/f;
        }
        System.out.printf("%f", result);

    }
}
