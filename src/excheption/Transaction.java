package excheption;

public class Transaction {
    private static int counter = 1;
    private final int id;
    private final double amount;
    private final PaymentType method;

    public Transaction(double amount, PaymentType method) {
        this.id = counter++;
        this.amount = amount;
        this.method = method;
    }

    @Override
    public String toString() {
        return "Transaction #" + id + " | Amount: $" + amount + " | Method: " + method;
    }
}
