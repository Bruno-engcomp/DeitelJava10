import java.util.Scanner;

public class SeparandoDigitos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number with 5 digits:");
        float n = input.nextFloat();

        System.out.printf("%.0f %.0f %.0f %.0f %.0f", n/10000, (n%10000) / 1111, (n%1000) / 111 , (n%100) / 11 , n%10);

    }
}
