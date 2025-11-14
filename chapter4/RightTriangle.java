import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2,n3, c1, c2 ,hipotenuse = 0;
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
        if (n1 >= n2 && n1 >= n3)
        {
            hipotenuse = n1;
            c1 = n2;
            c2 = n3;
        }
        else if (n2 >= n1 && n2 >= n3)
        {
            hipotenuse = n2;
            c1 = n1;
            c2 = n3;
        }
        else
        {
            hipotenuse = n3;
            c1 = n1;
            c2 = n2;
        }
        System.out.printf("The hipotenuse of the triangle is %d%n", hipotenuse);
        if(((c1*c1)+(c2*c2))==(hipotenuse*hipotenuse))
            System.out.println("This is a Right triangle");
        else
            System.out.println("This is not a Right triangle");
    }
}
