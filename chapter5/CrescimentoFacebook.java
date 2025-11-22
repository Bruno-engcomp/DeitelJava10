public class CrescimentoFacebook {
    public static void main(String[] args) {
        int i, users = 1000000000;

        for (i = 0; i < 1000; i++) {
            users += users*0.04;
            if(users > 1500000000)
                break;
        }
        System.out.printf("In %d months, facebook will have 1500000000 users", i);
    }
}
