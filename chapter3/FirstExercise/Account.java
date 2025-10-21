package FirstExercise;

public class Account {
    private String name; // variável de instância
    private double balance; // variável de instância

    public Account(String name, double balance)
    {
        this.name = name; // atribui name à variável de instância name

        // valida que o balance é maior que 0.0; se não for,
        // a variável de instância balance mantém seu valor inicial padrão de 0.0
        if(balance > 0.0) // se o saldo for válido
            this.balance = balance; // o atribui à variável de instância balance
    }
    // método que deposita (adiciona) apenas uma quantia válida no saldo
    public void deposit(double depositAmount)
    {
        if (depositAmount > 0.0) //Se o deposito for valido
            balance = balance + depositAmount; // o adiciona ao saldo

    }
    public void withdrawal(double withdrawal)
    {
        if(withdrawal < balance && withdrawal > 0.0) // Se o saque for validado
            balance = balance - withdrawal; // Retira o saldo
        else
            System.out.println("withdraw amount exceeded account balance or invaled withdraw");
    }

    // Metodo que retorna o saldo de conta
    public double getBalance()
    {
        return balance;
    }

    // Metodo que define o nome
    public void setName(String name)
    {
        this.name = name;
    }
    // Metodo para retorna o nome
    public String getName()
    {
        return name; // retorna o valor de name ao chamador
    } // Fim do metodo getName
} // fim da classe Account
