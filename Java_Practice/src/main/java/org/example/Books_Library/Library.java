package org.example.Books_Library;

import org.example.Books_Library.Exceptions.BookPagesAreNullException;
import org.example.Books_Library.Exceptions.NameIsNullException;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public List<Book> addNewBook(Book book) {
        List<Book> books = new ArrayList<>();
        Book book1 = new Book(book.getName(), book.getAuthor(), book.getNumberOfPages(), TYPE.ALBUM, false);
        validateBook(book1);
        return books;
    }

    public void validateBook(Book book) {
        try {
            if (book.getName().isEmpty() || book.getName() == null) {
                throw new NameIsNullException();
            }
            if (book.getAuthor().isEmpty()) {
                book.setAuthor("NA");
            }
            if (book.getNumberOfPages() <= 0) {
                throw new BookPagesAreNullException();
            }
        } catch (NameIsNullException | BookPagesAreNullException e) {
            throw new RuntimeException(e);
        }
    }
}
