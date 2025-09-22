
interface Refuelable {

    void refuel();
}

class Vehicle {

    int maxSpeed;
    String model;

    Vehicle(int s, String m) {
        maxSpeed = s;
        model = m;
    }
}

class ElectricVehicle extends Vehicle {

    ElectricVehicle(int s, String m) {
        super(s, m);
    }

    void charge() {
        System.out.println("Charging " + model);
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {

    PetrolVehicle(int s, String m) {
        super(s, m);
    }

    @Override
    public void refuel() {
        System.out.println("Refueling " + model);
    }
}

public class VehicleHybridTest {

    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla");
        PetrolVehicle pv = new PetrolVehicle(120, "Toyota");
        ev.charge();
        pv.refuel();
    }
}
