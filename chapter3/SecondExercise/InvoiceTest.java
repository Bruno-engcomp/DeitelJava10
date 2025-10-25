package SecondExercise;
import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nname;
        String ndescription;
        double nprice;
        int number;

        Invoice keyboard = new Invoice("keyboard","The best keyboard", 25.00);
        Invoice mouse = new Invoice("mouse", "A really nice mouse", 10.00);

        System.out.printf("Product: %s%nDescription: %s%nPrice: %.2f%n%n", keyboard.getName(), keyboard.getDescription(), keyboard.getPrice());
        System.out.printf("Product: %s%nDescription: %s%nPrice: %.2f%n%n", mouse.getName(), mouse.getDescription(), mouse.getPrice());

        System.out.print("Enter the new price of mouse: ");
        nprice = input.nextDouble();
        mouse.setPrice(nprice);

        System.out.printf("The new mouse price is %.2f%n%n", mouse.getPrice());

        System.out.printf("Enter the new price of keyboard: ");
        nprice = input.nextDouble();
        keyboard.setPrice(nprice);

        System.out.printf("The new price of keyboard is %.2f%n%n", keyboard.getPrice());

        // Clear de input buffer
        input.nextLine();

        System.out.printf("Enter the new description of mouse: ");
        ndescription = input.nextLine();
        mouse.setDescription(ndescription);

        System.out.printf("Enter the new description of keyboard: ");
        ndescription = input.nextLine();
        keyboard.setDescription(ndescription);

        System.out.printf("The new description of mouse is %s%n", mouse.getDescription());
        System.out.printf("The new description of keyboard is %s%n%n", keyboard.getDescription());

        System.out.printf("Enter the number of mouses you want to sell: ");
        number = input.nextInt();
        mouse.setNumber(number);

        System.out.printf("Enter the number of keyboard you want to sell: ");
        number = input.nextInt();
        keyboard.setNumber(number);

        System.out.printf("%nThe invoice Amout of mouse is $%.2f%n", mouse.getInvoiceAmount(mouse.getNumber(),mouse.getPrice()));
        System.out.printf("The invoice Amout of keyboard is $%.2f%n", keyboard.getInvoiceAmount(keyboard.getNumber(),keyboard.getPrice()));


    }
}
