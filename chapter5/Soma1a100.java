public class Soma1a100 {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 1; i <= 100; i++)
        {
            if(i % 2 != 0)
                n += i;
        }
        System.out.println("Soma de 1 a 100 = " + n);
        System.out.println(Math.pow(2.5, 3));
    }
}
