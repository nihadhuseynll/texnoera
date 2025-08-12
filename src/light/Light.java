package light;

public class Light implements Device {
    private DeviceState state;

    public Light() {
        this.state = DeviceState.OFF;
    }

    @Override
    public void turnOn() {
        state = DeviceState.ON;
        System.out.println("Light is turned ON.");
    }

    @Override
    public void turnOff() {
        state = DeviceState.OFF;
        System.out.println("Light is turned OFF.");
    }

    @Override
    public void setState(DeviceState state) {
        this.state = state;
        System.out.println("Light state set to: " + state.getDescription());
    }

    @Override
    public DeviceState getState() {
        return state;
    }
}
