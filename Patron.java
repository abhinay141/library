package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name;
    private String patronId;
    private List<String> borrowedBooks;

    public Patron(String name, String patronId) {
        this.name = name;
        this.patronId = patronId;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getPatronId() {
        return patronId;
    }

    public List<String> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void addBorrowedBook(String isbn) {
        borrowedBooks.add(isbn);
    }

    public void removeBorrowedBook(String isbn) {
        borrowedBooks.remove(isbn);
    }
}
