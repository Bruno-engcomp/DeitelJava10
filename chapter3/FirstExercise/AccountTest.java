package FirstExercise;

import java.util.Scanner;

// Figura 3.9: AccountTest.Java
// Entrada e saída de números de ponto flutuante com objetos Account.
public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        //Exibe o saldo inicial de cada objeto

        System.out.printf("%s balance: $%.2f %n",account1.getName(),account1.getBalance());

        System.out.printf("%s balance: $%.2f %n",account2.getName(),account2.getBalance());

        // Cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter deposit amount for account1: "); // prompt
        double depositAmount = input.nextDouble(); // obtém a entrada do usuário

        System.out.printf("%n adding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount); // adiciona o saldo de account1

        // exibe os saldos
        displayAccount(account1);
        displayAccount(account2);


        System.out.printf("Enter deposit amount for account2: "); // prompt
        depositAmount = input.nextDouble(); // obtém a entrada do usuário

        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account2.deposit(depositAmount); // adiciona o saldo de account1

        // exibe os saldos
        displayAccount(account1);
        displayAccount(account2);

        System.out.printf("Enter Withdraw for account1: ");
        double withdrawal = input.nextDouble(); // Obtem a entrada do usuario

        System.out.printf("%n withdrawing %.2f from account1 balance%n%n", withdrawal);
        account1.withdrawal(withdrawal);

        // exibe os saldos
        displayAccount(account1);
        displayAccount(account2);

        System.out.printf("Enter Withdraw for account2: ");
        withdrawal = input.nextDouble(); // Obtem a entrada do usuario

        System.out.printf("%n withdrawing %.2f from account2 balance%n%n", withdrawal);
        account2.withdrawal(withdrawal);

        // exibe os saldos
        displayAccount(account1);
        displayAccount(account2);



    } // Fim de main
    public static void displayAccount(Account account)
    {
        System.out.printf("%s balance: $%.2f %n", account.getName(),account.getBalance());
    }
} // fim da classe


