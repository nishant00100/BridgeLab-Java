class Circle {
    private double radius;

    // Default constructor
    public Circle() {
        this(1.0);  // default radius
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public void display() {
        System.out.println("Radius: " + radius);
    }
}
