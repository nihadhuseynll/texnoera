package excheption;

public class Main {
    public static void main(String[] args) {

        PaymentProcessor processor = new PaymentProcessor();
        try {
            processor.processPayment(PaymentType.CRYPTO, 150.0);
            processor.processPayment(PaymentType.PAYPAL, -30.0);
        } catch (InvalidAmountException e) {
            System.err.println("Payment failed: " + e.getMessage());
        }

        int code = 201;

        try {
            PaymentStatus status = PaymentStatus.fromCode(code);
            System.out.println("Status: " + status);
            System.out.println("Message: " + status.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid status code: " + code);
        }
    }
}
