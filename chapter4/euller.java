public class euller {
    public static void main(String[] args) {
        double e = 0;
        double j = 1,f = 1;
        for (int i = 1; i < 10; i++, j++)
        {
            f *= i;
            e += j/f;
        }
        System.out.printf("%f", e);
    }
}
