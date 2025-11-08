package FirstExercise;

public class CreditLimitCalculatorTest {
    public static void main(String[] args) {
        CreditLimitCalculator client = new CreditLimitCalculator(12345, 2000, 1500, 500, 2500);
        client.accountSummary();
    }
}
