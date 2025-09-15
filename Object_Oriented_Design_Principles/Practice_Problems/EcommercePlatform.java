import java.util.*;

class Product {
    String name;
    double price;
    Product(String name, double price) { this.name = name; this.price = price; }
}

class Order {
    ArrayList<Product> products = new ArrayList<>();
    void addProduct(Product p) { products.add(p); }
    double total() { return products.stream().mapToDouble(p -> p.price).sum(); }
}

class CustomerE {
    String name;
    CustomerE(String name) { this.name = name; }
    void placeOrder(Order o) {
        System.out.println(name + " placed an order. Total: $" + o.total());
    }
}

public class EcommercePlatform {
    public static void main(String[] args) {
        CustomerE c = new CustomerE("David");
        Order o = new Order();
        o.addProduct(new Product("Laptop", 1000));
        o.addProduct(new Product("Mouse", 50));
        c.placeOrder(o);
    }
}
