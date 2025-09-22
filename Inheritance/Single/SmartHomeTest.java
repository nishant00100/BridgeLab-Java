
class Device {

    int deviceId;
    boolean status;

    Device(int deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}

class Thermostat extends Device {

    int temperatureSetting;

    Thermostat(int deviceId, boolean status, int temp) {
        super(deviceId, status);
        this.temperatureSetting = temp;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId + " | Status: " + (status ? "On" : "Off") + " | Temperature: " + temperatureSetting + "°C");
    }
}

public class SmartHomeTest {

    public static void main(String[] args) {
        Thermostat t = new Thermostat(101, true, 22);
        t.displayStatus();
    }
}
