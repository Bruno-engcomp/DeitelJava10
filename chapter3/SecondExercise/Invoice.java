package SecondExercise;

public class Invoice {
    String name;
    String description;
    int number;
    double price;
    double InvoiceAmount;

    public Invoice(String name ,String description, double price)
    {
        this.name = name;
        this.description = description;

        if (price > 0)
            this.price = price;
        else
            System.out.println("This price is invalid, set other price...");
    }
    public double getInvoiceAmount(int number, double price)
    {
        InvoiceAmount = number * price;
        return InvoiceAmount;
    }


    // Metodo que define o nome do produto
    public void setName(String name) {this.name = name;}

    public void setDescription(String description) {this.description = description;}

    public void setNumber(int number) {this.number = number;}

    public void setPrice(double price) {this.price = price;}

    public String getName() { return name; }

    public String getDescription() { return description; }

    public int getNumber() { return number; }

    public double getPrice() { return price; }





}
