import java.util.Scanner;

public class Fatorial1a20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        long fatorial = 1;
        while(true) {
            System.out.print("Enter a number for 1 to 20: ");
            n = input.nextInt();
            if (n <= 20 && n >= 1)
            {
                break;
            }
            System.out.println("Invalid number");
        }
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        System.out.printf("The fatorial of %d is %d", n, fatorial);
    }
}
