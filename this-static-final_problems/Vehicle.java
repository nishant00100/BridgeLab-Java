

public class Vehicle {
    private static double registrationFee = 100.0;

    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        if (newFee >= 0) registrationFee = newFee;
        else System.out.println("Invalid fee.");
    }

    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        }
    }

    public String getOwnerName() { return ownerName; }
    public String getVehicleType() { return vehicleType; }
    public String getRegistrationNumber() { return registrationNumber; }

    public static void main(String[] args) {
        Vehicle.updateRegistrationFee(150.0);
        Vehicle v1 = new Vehicle("Honest Raj", "Sedan", "ABC123");
        Vehicle v2 = new Vehicle("Price Danish", "SUV", "XYZ789");

        v1.displayRegistrationDetails();
        v2.displayRegistrationDetails();
    }
}
