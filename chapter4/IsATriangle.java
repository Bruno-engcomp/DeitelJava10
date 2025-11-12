import java.util.Scanner;
public class IsATriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2,n3;

        while(true)
        {
            System.out.print("Enter the size of the first side: ");
            n1 = input.nextInt();
            if(n1 > 0)
                break;
            else
            {
                System.out.println("Invalid number");
                continue;
            }

        }
        while(true)
        {
            System.out.print("Enter the size of the second side: ");
            n2 = input.nextInt();
            if(n2 > 0)
                break;
            else
            {
                System.out.println("Invalid number");
                continue;
            }
        }
        while(true)
        {
            System.out.print("Enter the size of the third side: ");
            n3 = input.nextInt();
            if(n3 > 0)
                break;
            else
            {
                System.out.println("Invalid number");
                continue;
            }
        }


        boolean itt = (n1 + n2) > n3 && (n3 + n2) > n1 && (n3 + n1) > n2;

        System.out.println("Is this a triangle: " + itt);
    }
}
