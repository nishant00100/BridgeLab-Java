import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotal() {
        return price * quantity;
    }

    void displayItem() {
        System.out.println(itemName + " x " + quantity + " = " + getTotal());
    }
}

class ShoppingCart {
    ArrayList<CartItem> items = new ArrayList<>();

    void addItem(CartItem item) {
        items.add(item);
        System.out.println(item.itemName + " added to cart.");
    }

    void removeItem(String itemName) {
        items.removeIf(item -> item.itemName.equalsIgnoreCase(itemName));
        System.out.println(itemName + " removed from cart.");
    }

    void displayCart() {
        double total = 0;
        System.out.println("Cart Items:");
        for (CartItem item : items) {
            item.displayItem();
            total += item.getTotal();
        }
        System.out.println("Total Cost: " + total);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new CartItem("Laptop", 45000, 1));
        cart.addItem(new CartItem("Phone", 20000, 2));
        cart.displayCart();
        cart.removeItem("Phone");
        cart.displayCart();
    }
}
