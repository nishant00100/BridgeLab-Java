class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    double calculateTotal(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item1 = new Item(101, "Laptop", 45000);
        item1.displayDetails();
        System.out.println("Total Cost for 2 items: " + item1.calculateTotal(2));
    }
}
