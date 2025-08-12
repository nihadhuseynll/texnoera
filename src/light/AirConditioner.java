package light;

public class AirConditioner implements Device {
    private DeviceState state;

    public AirConditioner() {
        this.state = DeviceState.OFF; // Default OFF
    }

    @Override
    public void turnOn() {
        state = DeviceState.ON;
        System.out.println("Air Conditioner is now cooling the room.");
    }

    @Override
    public void turnOff() {
        state = DeviceState.OFF;
        System.out.println("Air Conditioner is turned OFF.");
    }

    @Override
    public void setState(DeviceState state) {
        this.state = state;
        System.out.println("Air Conditioner state set to: " + state.getDescription());
    }

    @Override
    public DeviceState getState() {
        return state;
    }
}
