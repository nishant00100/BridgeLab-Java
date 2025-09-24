// Abstract class representing a general library item

abstract class LibraryItem {

    private int itemId;
    private String title;
    private String author;

    // Constructor
    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getters and setters with encapsulation
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        if (itemId > 0) {
            this.itemId = itemId;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author != null && !author.isEmpty()) {
            this.author = author;
        }
    }

    // Abstract method to define loan duration
    public abstract int getLoanDuration(); // duration in days

    // Concrete method to display item details
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
    }
}

// Interface for reservable items
interface Reservable {

    void reserveItem(String borrowerName);

    boolean checkAvailability();
}

// Book class
class Book extends LibraryItem implements Reservable {

    private boolean isAvailable = true;
    private String reservedBy;

    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 2 weeks
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            reservedBy = borrowerName;
            isAvailable = false;
            System.out.println("Book reserved by " + borrowerName);
        } else {
            System.out.println("Book is already reserved by " + reservedBy);
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

// Magazine class
class Magazine extends LibraryItem implements Reservable {

    private boolean isAvailable = true;
    private String reservedBy;

    public Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // 1 week
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            reservedBy = borrowerName;
            isAvailable = false;
            System.out.println("Magazine reserved by " + borrowerName);
        } else {
            System.out.println("Magazine is already reserved by " + reservedBy);
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

// DVD class
class DVD extends LibraryItem implements Reservable {

    private boolean isAvailable = true;
    private String reservedBy;

    public DVD(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            reservedBy = borrowerName;
            isAvailable = false;
            System.out.println("DVD reserved by " + borrowerName);
        } else {
            System.out.println("DVD is already reserved by " + reservedBy);
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

// Demo class
public class LibraryManagementSystem {

    public static void main(String[] args) {
        LibraryItem[] items = {
            new Book(1, "Java Programming", "Author A"),
            new Magazine(2, "Tech Today", "Editor B"),
            new DVD(3, "Inception", "Director C")
        };

        System.out.println("=== Library Items ===");
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Available: " + ((Reservable) item).checkAvailability());
            System.out.println("--------------------------");
        }

        // Reserve items
        System.out.println("=== Reserving Items ===");
        ((Reservable) items[0]).reserveItem("Alice");
        ((Reservable) items[1]).reserveItem("Bob");
        ((Reservable) items[2]).reserveItem("Charlie");

        // Try reserving again to test availability check
        ((Reservable) items[0]).reserveItem("David");
    }
}
