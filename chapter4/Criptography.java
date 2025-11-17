import java.util.Scanner;

public class Criptography {
    public static void main(String[] args) {
        int n, n1, n2, n3 ,n4, aux, encrypted;
        while(true)
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the four digit number: ");
            n = input.nextInt();

            if(n > 999 & n < 10000 )
            {
                break;
            }
            System.out.println("Enter a valid number");
        }
        n1 = n / 1000;
        n2 = (n / 100) % 10;
        n3 = (n / 10) % 10;
        n4 = n % 10 ;

        n1 = (n1 + 7) % 10;
        n2 = (n2 + 7) % 10;
        n3 = (n3 + 7) % 10;
        n4 = (n4 + 7) % 10;

        // Troca do 1 pelo 3
        aux = n1;
        n1 = n3;
        n3 = aux;

        // Troca do 2 pelo 4
        aux = n2;
        n2 = n4;
        n4 = aux;

        encrypted = (n1 * 1000) + (n2 * 100) + (n3 * 10) + n4;
        System.out.printf(" %d will be %d", n, encrypted);
    }
}
