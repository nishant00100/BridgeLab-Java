// Abstract class representing a vehicle in ride-hailing app
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    // Constructor
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Getters and setters with encapsulation
    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        if(vehicleId != null && !vehicleId.isEmpty()) this.vehicleId = vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        if(driverName != null && !driverName.isEmpty()) this.driverName = driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        if(ratePerKm >= 0) this.ratePerKm = ratePerKm;
    }

    // Abstract method to calculate fare
    public abstract double calculateFare(double distance);

    // Concrete method to display vehicle details
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per km: $" + ratePerKm);
    }
}

// Interface for GPS functionality
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Car class
class Car extends Vehicle implements GPS {
    private String currentLocation;

    public Car(String vehicleId, String driverName, double ratePerKm, String initialLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = initialLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Bike class
class Bike extends Vehicle implements GPS {
    private String currentLocation;

    public Bike(String vehicleId, String driverName, double ratePerKm, String initialLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = initialLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Auto class
class Auto extends Vehicle implements GPS {
    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm, String initialLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = initialLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Demo class
public class RideHailingApplication {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("CAR101", "Alice", 1.5, "Downtown"),
            new Bike("BIKE202", "Bob", 1.0, "Uptown"),
            new Auto("AUTO303", "Charlie", 0.8, "Suburb")
        };

        double distance = 10; // distance in km

        System.out.println("=== Ride Fare Details ===");
        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
            System.out.println("Current Location: " + ((GPS)v).getCurrentLocation());
            System.out.println("Fare for " + distance + " km: $" + v.calculateFare(distance));
            ((GPS)v).updateLocation("Destination"); // update location
            System.out.println("Updated Location: " + ((GPS)v).getCurrentLocation());
            System.out.println("-----------------------------");
        }
    }
}
