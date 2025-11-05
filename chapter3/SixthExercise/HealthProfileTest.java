package SixthExercise;
import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[] args) {
        HealthProfile patient1 = new HealthProfile("Bruno", "Almeida", "Male", 6, 9, 2007, 1.83 , 75.00);
        HealthProfile patient2 = new HealthProfile("Allana", "Kamilla", "Female", 14, 3, 2007, 1.64, 50.00);

        DisplayHealthProfile(patient1);
        heartRateInterval(patient1);
        DisplayHealthProfile(patient2);
        heartRateInterval(patient2);

    }

    public static void DisplayHealthProfile(HealthProfile Patient)
    {
        System.out.printf("%nName: %s%nSurname: %s%n", Patient.getName(),Patient.getSurname());
        System.out.printf("Sex: %s%n", Patient.getSex());
        System.out.printf("Birthday %d/%d/%d%n", Patient.getDd(),Patient.getMm(),Patient.getYy());
        System.out.printf("Age: %d%n", Patient.getAge());
        System.out.printf("IMC: %.2f%n", Patient.getImc());
    }

    public static void heartRateInterval(HealthProfile Patient)
    {
        double maxHeartRate = 220 - (2025 - Patient.getYy());
        System.out.printf("The max Heart Rate is %.1f%n", maxHeartRate);
        System.out.printf("The tarjet heart rate is from %.1f to %.1f%n", maxHeartRate * 0.5, maxHeartRate * 0.85);
    }

    public static void setMetods(HealthProfile Patient)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name: ");
        Patient.setName(input.nextLine());

        System.out.print("Enter the surname: ");
        Patient.setSurname(input.nextLine());

        System.out.print("Enter the sex: ");
        Patient.setSex(input.nextLine());

        System.out.print("Enter the birthday: ");
        Patient.setDd(input.nextInt());

        System.out.print("Enter the birthmonth: ");
        Patient.setMm(input.nextInt());

        System.out.print("Enter the birthyear: ");
        Patient.setYy(input.nextInt());
    }
}
