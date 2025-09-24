// Abstract class representing a general Product

abstract class Product {

    private int productId;
    private String name;
    private double price;

    // Constructor
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getters and setters with validation
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        if (productId > 0) {
            this.productId = productId;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    // Abstract method to calculate discount
    public abstract double calculateDiscount();

    // Concrete method to display product details
    public void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Discount: $" + calculateDiscount());
    }
}

// Interface for taxable products
interface Taxable {

    double calculateTax();

    String getTaxDetails();
}

// Electronics class implementing Product and Taxable
class Electronics extends Product implements Taxable {

    private static final double TAX_RATE = 0.18; // 18% GST

    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.1; // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax: $" + calculateTax();
    }
}

// Clothing class implementing Product and Taxable
class Clothing extends Product implements Taxable {

    private static final double TAX_RATE = 0.12; // 12% GST

    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.2; // 20% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax: $" + calculateTax();
    }
}

// Groceries class implementing Product (no tax)
class Groceries extends Product {

    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}

// Demo class for E-Commerce Platform
public class ECommercePlatform {

    public static void main(String[] args) {
        Product[] products = {
            new Electronics(1, "Laptop", 1000),
            new Clothing(2, "T-Shirt", 50),
            new Groceries(3, "Rice", 30)
        };

        System.out.println("=== Product Details ===");
        for (Product p : products) {
            p.displayProductDetails();
            if (p instanceof Taxable) { // Polymorphism for tax calculation
                Taxable t = (Taxable) p;
                System.out.println(t.getTaxDetails());
            }
            double finalPrice = p.getPrice() + (p instanceof Taxable ? ((Taxable) p).calculateTax() : 0) - p.calculateDiscount();
            System.out.println("Final Price: $" + finalPrice);
            System.out.println("------------------------");
        }
    }
}
