class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double DAILY_RATE = 50.0;

    public CarRental() {
        this("Unknown", "Sedan", 1);
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return DAILY_RATE * rentalDays;
    }

    public void display() {
        System.out.println(customerName + " rented " + carModel + " for " + rentalDays 
                           + " days. Total: $" + calculateTotalCost());
    }
}
