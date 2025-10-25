package SecondExercise;
import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nname;
        String ndescription;

        Invoice keyboard = new Invoice("keyboard","The best keyboard", 25.00);
        Invoice mouse = new Invoice("mouse", "A really nice mouse", 10.00);

        System.out.printf("Product: %s Description: %s price: %.2f%n", keyboard.getName(), keyboard.getDescription(), keyboard.getPrice());
        System.out.printf("Product: %s Description: %s price: %.2f%n%n", mouse.getName(), mouse.getDescription(), mouse.getPrice());

        System.out.print("Enter the new price of mouse: ");
        double nprice = input.nextDouble();
        mouse.setPrice(nprice);

        System.out.printf("The new mouse price is %.2f%n", mouse.getPrice());

        System.out.printf("Enter the new price of keyboard: ");
        nprice = input.nextDouble();
        keyboard.setPrice(nprice);

        System.out.println("The new price of keyboard is " + keyboard.getPrice());

        System.out.println("Enter the new description of mouse: ");

        System.out.println("Enter the new description of keyboard: ");
    }
}
