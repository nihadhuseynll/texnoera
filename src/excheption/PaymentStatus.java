package excheption;

public enum PaymentStatus {
    AUTHORIZED(200, "Payment has been authorized."),
    CAPTURED(201, "Payment has been captured successfully."),
    REFUNDED(202, "Payment has been refunded."),
    FAILED(500, "Payment failed.");

    private final int code;
    private final String message;

    PaymentStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static PaymentStatus fromCode(int code) {
        for (PaymentStatus status : PaymentStatus.values()) {
            if (status.getCode() == code) {
                return status;
            }
        }
        throw new IllegalArgumentException("Unknown payment code: " + code);
    }
}
