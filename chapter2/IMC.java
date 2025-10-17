import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight:");
        float w = input.nextFloat();

        System.out.print("Enter your height:");
        float h = input.nextFloat();
        float imc = w /(h*h);

        System.out.println("Your IMC is " + imc);
        if  (imc < 18.5)
            System.out.println("Underweight: less than 18.5");
        else if (imc < 25)
            System.out.println("Normal: between 18.5 and 24.9");
        else if (imc < 30)
            System.out.println("Overweight: between 25 and 29.9");
        else
            System.out.println("Obese: 30 or greater");
    }
}
