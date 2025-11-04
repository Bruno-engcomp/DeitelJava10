package FifthExercise;
import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        HeartRates Patient1 = new HeartRates("Bruno", "Almeida", 6,9,2007);
        HeartRates Patient2 = new HeartRates("Allana", "Kamilla", 14,3,2007);
        displayInformations(Patient1);
        Patient1.heartRateInterval(Patient1.getBirthyear());
        displayInformations(Patient2);
        Patient2.heartRateInterval(Patient2.getBirthyear());

        System.out.print("Enter the name of Patient1: ");
        Patient1.setName(input.nextLine());

        System.out.print("Enter the surname of Patient1: ");
        Patient1.setSurname(input.nextLine());

        System.out.print("Enter the new birthday (just the day) of Patient1: ");
        Patient1.setBirthday(input.nextInt());

        displayInformations(Patient1);
        System.out.printf("The age o patient1 is: %d", Patient1.getAge());
        Patient1.getAge();

    }

    public static void displayInformations(HeartRates patient)
    {
        System.out.printf("Name: %s%nSurname: %s%nbirthday %d/%d/%d%n", patient.getName(), patient.getSurname(),
                patient.getBirthday(), patient.getBirthmonth(), patient.getBirthyear());
    }
}
