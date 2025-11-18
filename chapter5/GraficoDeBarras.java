import java.util.Scanner;

public class GraficoDeBarras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 5; i++)
        {
            int n = 0;
            while (true)
            {
                System.out.print("Enter a number between 1 and 30: ");
                n = input.nextInt();
                if(n > 0 && n < 31)
                    break;
                System.out.println("This number is invalid");
            }
            for(int j = 1; j <= n; j++)
                System.out.print("*");
            System.out.println();
        }

    }
}
