import java.util.Scanner;
public class FindingBiggest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largest = 0;
        int n;
        for(int i = 1; i <= 10; i++)
        {
            System.out.print("Enter a number: ");
            n = input.nextInt();
            if (n > largest)
                largest = n;
        }
        System.out.printf("The biggest number is %d", largest);
    }
}
