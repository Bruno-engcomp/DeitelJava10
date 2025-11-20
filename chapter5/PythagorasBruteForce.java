public class PythagorasBruteForce {
    public static void main(String[] args) {
        for (int i = 1; i < 500; i++) {
            for (int j = 1; j < 500; j++) {
                for (int k = 1; k < 500; k++) {
                    if((i*i)+(j*j)==(k*k))
                        System.out.printf("%d + %d = %d is a Pythagorean triangle%n",i ,j, k);

                }

            }

        }
    }
}
