package light;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeController {
    private List<Device> devices;

    public SmartHomeController() {
        devices = new ArrayList<>();
    }

    public void addDevice(Device device) {
        devices.add(device);
        System.out.println("Device added: " + device.getClass().getSimpleName());
    }

    public void turnAllOn() {
        for (Device device : devices) {
            device.turnOn();
        }
    }

    public void turnAllOff() {
        for (Device device : devices) {
            device.turnOff();
        }
    }
}
