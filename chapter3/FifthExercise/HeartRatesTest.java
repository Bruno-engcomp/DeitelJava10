package FifthExercise;

public class HeartRatesTest {
    public static void main(String[] args) {
        HeartRates Patient1 = new HeartRates("Bruno", "Almeida", 6,9,2007);
        HeartRates Patient2 = new HeartRates("Allana", "Kamilla", 14,3,2007);


    }

    public static void displayInformations(HeartRates patient)
    {
        System.out.printf("Name: %s%nSurname: %s%nbirthday %d/%d/%d ", patient.getName(), patient.getSurname(),
                patient.getBirthday(), patient.getBirthmonth(), patient.getBirthyear());
    }
}
