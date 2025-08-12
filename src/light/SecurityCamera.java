package light;

public class SecurityCamera implements Device {
    private DeviceState state;

    public SecurityCamera() {
        this.state = DeviceState.OFF; // Default OFF
    }

    @Override
    public void turnOn() {
        state = DeviceState.ON;
        System.out.println("Security Camera is now recording.");
    }

    @Override
    public void turnOff() {
        state = DeviceState.OFF;
        System.out.println("Security Camera is turned OFF.");
    }

    @Override
    public void setState(DeviceState state) {
        this.state = state;
        System.out.println("Security Camera state set to: " + state.getDescription());
    }

    @Override
    public DeviceState getState() {
        return state;
    }
}
