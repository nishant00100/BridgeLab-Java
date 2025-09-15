import java.util.ArrayList;

class Book {
    String title, author;
    Book(String title, String author) { this.title = title; this.author = author; }
}

class Library {
    String name;
    ArrayList<Book> books = new ArrayList<>();
    Library(String name) { this.name = name; }
    void addBook(Book b) { books.add(b); }
    void showBooks() {
        System.out.println("Books in " + name + ":");
        for (Book b : books) System.out.println(" - " + b.title + " by " + b.author);
    }
}

public class LibraryBooks {
    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell");
        Book b2 = new Book("Hamlet", "Shakespeare");
        Library lib1 = new Library("City Library");
        lib1.addBook(b1); lib1.addBook(b2);
        lib1.showBooks();
    }
}
