class Book {
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this("Unknown", "Unknown", 0.0); // constructor chaining
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;   // using 'this' to avoid ambiguity
        this.author = author;
        this.price = price;
    }

    // Encapsulated helper logic
    private double applyDiscount(double discountRate) {
        return price - (price * discountRate);
    }

    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}
