import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int original, rest, binary, n;
        System.out.print("Enter a binary number (just 0 and 1): ");
        int number = input.nextInt();
        original = number;
        binary = 0;
        n = 1;


        while(number > 0)
        {
            rest = number % 10;
            binary = binary + (rest * n);
            number /= 10;
            n = n * 2;
        }
        System.out.println(binary);

    }
}
