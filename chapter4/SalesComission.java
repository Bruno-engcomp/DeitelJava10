import java.util.Scanner;
public class SalesComission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalSales = 0.0;
        double sold = 0.0;

        System.out.println("If you want to stop enter a number less than 0");
        while(true)
        {
            System.out.print("Enter the price of the sold item:");
            sold = input.nextDouble();
            if(sold < 0)
                break;
            totalSales += sold;


        }
        System.out.printf("The seller's income was: %.2f", 200 + (totalSales * 0.09));

    }
}
