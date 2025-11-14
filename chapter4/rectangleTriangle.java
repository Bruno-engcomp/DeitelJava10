import java.util.Scanner;

public class rectangleTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2,n3;
        while(true)
        {
            while(true)
            {
                System.out.print("Enter the size of the first side of the triangle: ");
                n1 = input.nextInt();
                if(n1 > 0)
                    break;
                else
                    System.out.println("Enter a valid size of the triangle");
            }
            while(true)
            {
                System.out.print("Enter the size of the second side of the triangle: ");
                n2 = input.nextInt();
                if(n2 > 0)
                    break;
                else
                    System.out.println("Enter a valid size of the triangle");
            }
            while(true)
            {
                System.out.print("Enter the size of the third side of the triangle: ");
                n3 = input.nextInt();
                if(n1 > 0)
                    break;
                else
                    System.out.println("Enter a valid size of the triangle");
            }

            boolean iat = (n1 + n2) > n3 && (n3 + n2) > n1 && (n3 + n1) > n2;
            if(!iat) {
                System.out.println("This not a valid triangle");
            }
            else
                break;
        }
    }
}
