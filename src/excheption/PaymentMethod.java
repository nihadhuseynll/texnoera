package excheption;

public interface PaymentMethod {
    void pay(double amount) throws InvalidAmountException;
}
