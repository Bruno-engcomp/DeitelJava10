package SixthExercise;


public class HealthProfileTest {
    public static void main(String[] args) {
        HealthProfile patient1 = new HealthProfile("Bruno", "Almeida", "Male", 6, 9, 2007, 1.83 , 75.00);
        HealthProfile patient2 = new HealthProfile("Allana", "Kamilla", "Female", 14, 3, 2007, 1.64, 50.00);
    }

    public static void heartRateInterval(HealthProfile Patient)
    {
        double maxHeartRate = 220 - (2025 - Patient.yy);
        System.out.printf("The max Heart Rate is %.1f%n", maxHeartRate);
        System.out.printf("The tarjet heart rate is from %f to %.1f%n%n", maxHeartRate * 0.5, maxHeartRate * 0.85);
    }
}
