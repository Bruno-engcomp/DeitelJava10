import java.util.Scanner;

public class fatorialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;;
        while(true)
        {
            System.out.print("Enter a positive number: ");
            n = input.nextInt();
            if(n > 0)
                break;
            System.out.println("This number is invalid");

        }
        int f = 1;

        for(int i = n; i > 0; i--)
        {
            f *= i;
        }
        System.out.printf("The fatorial of %d is %d",n , f);
    }
}
