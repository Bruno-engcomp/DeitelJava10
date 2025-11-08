package FirstExercise;

public class CreditLimitCalculator {
    private int accountNumber;
    private int totalItems;
    private int startBalance;
    private int totalCredit;
    private int creditLimit;

    public CreditLimitCalculator(int accountNumber, int totalItems, int startBalance, int totalCredit, int creditLimit)
    {
        if (accountNumber > 0)
            this.accountNumber = accountNumber;
        if (startBalance > 0)
            this.startBalance = startBalance;
        if (totalItems > 0)
            this.totalItems = totalItems;
        if (totalCredit > 0)
            this.totalCredit = totalCredit;
        if (creditLimit > 0)
            this.creditLimit = creditLimit;
    }

    int getAccountNumber () { return accountNumber;}
    int getTotalItens () {return totalItems;}
    int getStartbalance () {return startBalance;}
    int getTotalCredit () {return totalCredit;}
    int getCreditLimit () {return creditLimit;}
    int getNewbalance ()
    {
        int newBalance = startBalance + totalItems - totalCredit;
        return newBalance;
    }
    boolean isCreditLimitExceded () {
        return getNewbalance() > creditLimit;
    }

    void accountSummary ()
    {
        System.out.println("Account number: " + getAccountNumber());
        System.out.println("Starting Balance: " + getStartbalance());
        System.out.println("Total Charges:" + getTotalItens());
        System.out.println("Total Credits: " + getTotalCredit());
        System.out.println("Credit Limit: " + getCreditLimit());
        System.out.println("New balance: " + getNewbalance());
        if(isCreditLimitExceded())
            System.out.println("Credit limit Exceded");
        else
            System.out.println("Credit within limit");
    }

}
