package FourthExercise;

import java.util.Scanner;
public class DisplayDate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day;
        int month;
        int year;

        Date date1 = new Date (29,10,2025);
        date1.displayDate ();
        System.out.print("Enter the day:");
        day = input.nextInt();
        date1.setDay(day);

        System.out.print("Enter the month:");
        month = input.nextInt();
        date1.setMonth(month);

        System.out.print("Enter the year:");
        year = input.nextInt();
        date1.setYear(year);

        date1.displayDate ();
    }
}
