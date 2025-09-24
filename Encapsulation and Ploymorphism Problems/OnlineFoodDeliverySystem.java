// Abstract class representing a general food item
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and setters with encapsulation
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        if(itemName != null && !itemName.isEmpty()) this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price >= 0) this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity >= 0) this.quantity = quantity;
    }

    // Abstract method to calculate total price
    public abstract double calculateTotalPrice();

    // Concrete method to display item details
    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price per unit: $" + price);
        System.out.println("Quantity: " + quantity);
    }
}

// Interface for discountable items
interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

// VegItem class
class VegItem extends FoodItem implements Discountable {
    private static final double DISCOUNT_RATE = 0.1; // 10% discount

    public VegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity(); // no extra charges
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * DISCOUNT_RATE;
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Discount: $" + applyDiscount();
    }
}

// NonVegItem class
class NonVegItem extends FoodItem implements Discountable {
    private static final double EXTRA_CHARGE = 5; // extra charge per order
    private static final double DISCOUNT_RATE = 0.05; // 5% discount

    public NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + EXTRA_CHARGE; // includes extra charge
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * DISCOUNT_RATE;
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Discount: $" + applyDiscount();
    }
}

// Demo class
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem[] order = {
            new VegItem("Paneer Butter Masala", 10, 2),
            new NonVegItem("Chicken Curry", 15, 1)
        };

        System.out.println("=== Order Details ===");
        for(FoodItem item : order) {
            item.getItemDetails();
            double totalPrice = item.calculateTotalPrice();
            if(item instanceof Discountable) {
                Discountable d = (Discountable) item; // polymorphism
                System.out.println(d.getDiscountDetails());
                totalPrice -= d.applyDiscount();
            }
            System.out.println("Final Price: $" + totalPrice);
            System.out.println("----------------------------");
        }
    }
}
