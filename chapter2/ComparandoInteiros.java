import java.util.Scanner;
public class ComparandoInteiros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the First Integer:");
        int n1 = input.nextInt();

        System.out.print("Enter the second Integer:");
        int n2 = input.nextInt();

        if (n1 > n2)
            System.out.println(n1 + " is larger then " + n2);
        else if (n1 == n2)
            System.out.println(n1 + " equals " + n2);
        else
            System.out.println(n2 + " is larger then " + n1);

    }
}
