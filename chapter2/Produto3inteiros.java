import java.util.Scanner;
public class Produto3inteiros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number:");
        int x = input.nextInt();
        System.out.print("Enter the second number:");
        int y = input.nextInt();
        System.out.print("Enter the third number:");
        int z = input.nextInt();
        int result = x*y*z;

        System.out.println("Product is " + result);

    }
}
