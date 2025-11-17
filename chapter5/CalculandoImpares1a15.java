public class CalculandoImpares1a15 {
    public static void main(String[] args) {
        int n = 1;
        for (int i = 0; i <= 15; i++) {
            if(i % 2 != 0)
                n *= i;

        }
        System.out.println(n);
    }
}
