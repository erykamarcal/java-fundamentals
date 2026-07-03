package javastudies.dataStructures.lists.libraryManagement.entities;

import java.util.List;

public class Book {
    private int id;
    private String title;
    private String author;
    private int availableQuantity;

    public Book(int id, String title, String author, int availableQuantity) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.availableQuantity = availableQuantity;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }
        public void borrowBook () {
            availableQuantity -= 1;
        }

        public void returnBook () {
            availableQuantity += 1;
        }

    public String toString() { return id
            + ", "
            + title
            + ", "
            + author
            + ", "
            + availableQuantity + "\n"; }
    }
