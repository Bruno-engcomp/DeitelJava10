import java.util.Scanner;
public class Aritmetica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number:");
        float n1 = input.nextFloat();

        System.out.print("Enter the second number:");
        float n2 = input.nextFloat();

        System.out.printf("The sum of %.2f and %.2f is %.2f%n", n1, n2, n1 + n2);
        System.out.printf("The subtraction of %.2f and %.2f is %.2f%n", n1, n2, n1 - n2);
        System.out.printf("The product of %.2f and %.2f is %.2f%n", n1, n2, n1 * n2);
        System.out.printf("The division of %.2f and %.2f is %.2f%n", n1, n2, n1 / n2);
    }
}
