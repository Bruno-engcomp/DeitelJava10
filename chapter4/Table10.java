public class Table10 {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("N\t 10*N\t100*N\t1000*N\t");
        while(i <= 5)
        {
            System.out.printf("%d\t  %d\t %d\t %d\t%n", i, i * 10, i * 100, i * 1000);
            i++;
        }
    }
}
