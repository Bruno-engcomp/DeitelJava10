package SecondExercise;

import java.util.Scanner;
public class WageCalculatorTest {
    public static void main(String[] args) {
        WageCalculator Employee1 = new WageCalculator("Bruno", 200, 20, 10);
        WageCalculator Employee2 = new WageCalculator("Luciete", 400, 30, 0);
        WageCalculator Employee3 = new WageCalculator("Raimundo", 300, 40, 0);
        set(Employee1);
        Employee1.employeeSummary();
        set(Employee2);
        Employee2.employeeSummary();
        set(Employee3);
        Employee3.employeeSummary();


    }

    public static void set(WageCalculator Em)
    {
        Scanner input = new Scanner (System.in);
        System.out.printf("Employee: %s%n", Em.getName());
        System.out.print("Enter the wage/hours: ");
        Em.setHoursWage(input.nextDouble());

        System.out.print("Enter the worked hours: ");
        Em.setHours(input.nextInt());

        System.out.print("Enter the Extra worked hours: ");
        Em.setExtraHours(input.nextInt());
    }
}
