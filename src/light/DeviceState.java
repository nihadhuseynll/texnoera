package light;

public enum DeviceState {
    ON(1, "Device is powered on"),
    OFF(0, "Device is powered off"),
    STANDBY(2, "Device is in standby mode");

    private final int code;
    private final String description;

    DeviceState(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
