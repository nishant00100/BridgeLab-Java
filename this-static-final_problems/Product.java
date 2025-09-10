// package com.bridgelabz.oops.inbuiltfunction;

public class Product {
    private static double discount = 0.0;

    private final String productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        if (newDiscount >= 0 && newDiscount <= 100) discount = newDiscount;
        else System.out.println("Invalid discount value.");
    }

    public double getDiscountedPrice() { return price - (price * discount / 100); }

    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Price after Discount: $" + getDiscountedPrice());
        }
    }

    public String getProductID() { return productID; }
    public String getProductName() { return productName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public static void main(String[] args) {
        Product.updateDiscount(10.0);
        Product p1 = new Product("P001", "Laptop", 1200.00, 5);
        Product p2 = new Product("P002", "Smartphone", 800.00, 10);

        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();
    }
}
