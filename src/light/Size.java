package light;

enum Size {
    SMALL(1), MEDIUM(2), LARGE(3);

    private int value;

    Size(int value) {
        this.value = value;
        System.out.println("Constructor: " + value);
    }

    public int getValue() {
        return value;
    }
}

