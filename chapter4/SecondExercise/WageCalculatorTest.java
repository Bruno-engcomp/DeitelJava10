package SecondExercise;

import java.util.Scanner;
public class WageCalculatorTest {
    public static void main(String[] args) {
        WageCalculator Employee1 = new WageCalculator("Bruno", 200, 20, 10);
        set(Employee1);
        Employee1.employeeSummary();


    }

    public static void set(WageCalculator Em)
    {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter the wage/hours: ");
        Em.setHoursWage(input.nextDouble());

        System.out.print("Enter the worked hours: ");
        Em.setHours(input.nextInt());

        System.out.print("Enter the Extra worked hours: ");
        Em.setExtraHours(input.nextInt());
    }
}
