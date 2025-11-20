public class ValorPI {
    public static void main(String[] args) {
        double pi = 4;
        int j = 2;

        for (long i = 3; i < 10000000L; i += 2)
        {
            if(j % 2 == 0)
                pi -= (4.0 / i);
            else
                pi += (4.0 / i);
            j++;
        }
        System.out.printf("%f", pi);
    }
}
