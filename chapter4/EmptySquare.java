import java.util.Scanner;

public class EmptySquare {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Select the size of square: ");
        int n = input.nextInt();
        for (int i = n; i > 0; i--)
        {
            System.out.print("*");
        }
        System.out.println();
        for (int j = n - 2; j > 0; j--)
        {
            System.out.print("*");
            for (int k = n-2; k > 0; k--)
            {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = n; i > 0; i--)
        {
            System.out.print("*");
        }


    }
}
