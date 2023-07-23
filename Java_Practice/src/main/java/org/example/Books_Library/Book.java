package org.example.Books_Library;

import java.util.Objects;

public class Book {
    private String name;
    private String author;
    private int numberOfPages;
    private TYPE type;
    private boolean forAdultsOnly;


    public Book(String name, String author, int numberOfPages, TYPE type, boolean forAdultsOnly) {
        this.name = name;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.type = type;
        this.forAdultsOnly = forAdultsOnly;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public TYPE getType() {
        return type;
    }

    public boolean isForAdultsOnly() {
        return forAdultsOnly;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "\nBook{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", type=" + type +
                ", forAdultsOnly=" + forAdultsOnly +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return numberOfPages == book.numberOfPages && forAdultsOnly == book.forAdultsOnly && Objects.equals(name, book.name) && Objects.equals(author, book.author) && type == book.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, numberOfPages, type, forAdultsOnly);
    }
}
