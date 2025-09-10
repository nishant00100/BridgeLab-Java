// package com.bridgelabz.oops.inbuiltfunction;

public class Book {
    private static String libraryName;

    private String title;
    private String author;
    private final String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void setLibraryName(String name) { libraryName = name; }
    public static void displayLibraryName() { System.out.println("Library Name: " + libraryName); }

    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }

    public static void main(String[] args) {
        Book.setLibraryName("Egmore Library");
        Book.displayLibraryName();

        Book book1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
        book1.displayBookDetails();
    }
}
