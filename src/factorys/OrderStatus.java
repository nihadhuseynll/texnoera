package factorys;

public enum OrderStatus {
    NEW(1),
    PROCESSING(2),
    FINISHED(3);

    private int value;

    public int getValue() {
        return value;
    }

    OrderStatus(int value) {
        this.value = value;
    }
}
