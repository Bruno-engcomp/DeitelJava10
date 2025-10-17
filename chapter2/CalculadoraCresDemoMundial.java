
public class CalculadoraCresDemoMundial {
    public static void main(String[] args) {
        double pm = 8252891666d;
        float tc = 1.01f;

        System.out.printf("The world population in one year will be %,.0f%n ", pm*tc);
        System.out.printf("The world population in two years will be %,.0f%n", pm*tc*tc);
        System.out.printf("The world population in three years will be %,.0f%n", pm*tc*tc*tc);
        System.out.printf("The world population in four years will be %,.0f%n", pm*tc*tc*tc*tc);
        System.out.printf("The world population in five years will be %,.0f%n", pm*tc*tc*tc*tc*tc);

    }
}
