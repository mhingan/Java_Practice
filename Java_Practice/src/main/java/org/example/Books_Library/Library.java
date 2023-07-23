package org.example.Books_Library;

import org.example.Books_Library.Exceptions.BookAlreadyExistException;
import org.example.Books_Library.Exceptions.BookNotFoundException;
import org.example.Books_Library.Exceptions.BookPagesAreNullException;
import org.example.Books_Library.Exceptions.NameIsNullException;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<>();

    public List<Book> addNewBook(Book book) {
        Book book1 = new Book(book.getName(), book.getAuthor(), book.getNumberOfPages(), book.getType(), book.isForAdultsOnly(), book.getId(), book.getQuantity());
        validateBook(book1);
        return books;
    }

    public void validateBook(Book book) {
        try {
            for (Book book1 : books) {
                if (book1.getId() == book.getId()) {
                    throw new BookAlreadyExistException();
                } else {
                    books.add(book);
                    break;
                }
            }
            if (book.getName().isEmpty() || book.getName() == null) {
                throw new NameIsNullException();
            }
            if (book.getAuthor().isEmpty()) {
                book.setAuthor("NA");
            }
            if (book.getNumberOfPages() <= 0) {
                throw new BookPagesAreNullException();
            }
        } catch (NameIsNullException | BookPagesAreNullException | BookAlreadyExistException e) {
            throw new RuntimeException(e);
        }
        books.add(book);
        System.out.println("Book added successfully: " +
                "\nid: " + book.getId() +
                "\nname: " + book.getName() +
                "\nauthor: " + book.getAuthor() +
                "\npage number: " + book.getNumberOfPages() +
                "\ntype: " + book.getType() +
                "\nadults only: " + book.isForAdultsOnly());
    }

    public List<Book> deleteBook(int id) throws BookNotFoundException {
        for (Book book : books) {
            if (book.getId() == id) {
                System.out.println("Book found, deleting it..");
                books.remove(book);
                System.out.println(books);
                break;
            } else {
                throw new BookNotFoundException("Book with id " + id + " not found.");
            }
        }
        return books;
    }

    public void sellBook(int id) throws BookNotFoundException {
        for(Book book : books){
            if(book.getId() == id && book.getQuantity() > 0){
                book.setQuantity(book.getQuantity() - 1);
                System.out.println("Book sold. New quantity: " + book.getQuantity());
            }
            if(book.getQuantity()<=0){
                throw new BookNotFoundException("Book out of stock.");
            }
        }
    }



}
