import java.sql.SQLOutput;
import java.util.Scanner;
public class AritmeticaMenorEMaior {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number:");
        float n1 = input.nextFloat();

        System.out.print("Enter the second number:");
        float n2 = input.nextFloat();

        System.out.print("Enter the third number:");
        float n3 = input.nextFloat();

        System.out.printf("The sum of %.2f and %.2f and %.2f is %.2f%n ", n1, n2, n3, n1 + n2 + n3 );

        System.out.printf("The product of %.2f and %.2f and %.2f is %.2f%n ", n1, n2, n3, n1 * n2 * n3 );

        System.out.printf("The avarage of %.2f and %.2f and %.2f is %.0f%n ", n1, n2, n3, (n1 + n2 + n3)/3 );

        if (n1 > n2 && n1 > n3)
            System.out.println("The largest number is " + n1);
        else if (n2 > n3 && n2 > n1)
            System.out.println("The largest number is " + n2);
        else
            System.out.println("The largest number is " + n3);
        if (n1 < n2 && n1 < n3)
            System.out.println("The smallest number is " + n1);
        else if (n2 < n3 && n2 < n1)
            System.out.println("The smallest number is " + n2);
        else
            System.out.println("The smallest number is " + n3);

    } //Fim metodo
} // Fim Classe
