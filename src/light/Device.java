package light;

public interface Device {
    void turnOn();

    void turnOff();

    void setState(DeviceState state);

    DeviceState getState();
}
