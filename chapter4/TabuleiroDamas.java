public class TabuleiroDamas {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++)
        {
            if(i % 2 == 0) {
                for (int j = 0; j < 8; j++) {
                    System.out.print("* ");
                }
            }
            else
            {
                for (int j = 0; j < 8; j++)
                {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}
