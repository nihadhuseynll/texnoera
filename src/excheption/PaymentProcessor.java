package excheption;

public class PaymentProcessor {
    public void processPayment(PaymentType type, double amount) throws InvalidAmountException {
        PaymentMethod method;
        switch (type) {
            case CREDIT_CARD -> method = new CreditCardPayment();
            case PAYPAL -> method = new PayPalPayment();
            case CRYPTO -> method = new CryptoPayment();
            default -> throw new IllegalArgumentException("Unknown payment method");
        }
        method.pay(amount);

        Transaction transaction = new Transaction(amount, type);
        System.out.println(transaction);
    }
}