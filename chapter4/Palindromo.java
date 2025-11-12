import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, original, invertido, resto;
        while(true)
        {
            System.out.print("Enter a five digit number: ");
            n = input.nextInt();
            if(n > 9999 && n < 100000)
                break;
            System.out.println("Error, the digited number is not a five digit number");
        }
        original = n;
        invertido = 0;

        while(n > 0)
        {
            resto = n % 10;
            invertido = invertido * 10 + resto;
            n /= 10;
        }
        System.out.print(invertido);


    }
}
