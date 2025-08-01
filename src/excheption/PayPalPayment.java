package excheption;

public class PayPalPayment implements PaymentMethod {
    @Override
    public void pay(double amount) throws InvalidAmountException {
        if (amount <= 0) throw new InvalidAmountException("Amount must be greater than 0.");
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}
