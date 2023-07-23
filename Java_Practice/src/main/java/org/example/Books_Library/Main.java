package org.example.Books_Library;

import org.example.Books_Library.Exceptions.BookNotFoundException;

public class Main {
    public static void main(String[] args) throws BookNotFoundException {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 978, TYPE.NOVEL, false, 1, 3);
        Book book22 = new Book("The Great Gatsby 2", "F. Scott Fitzgerald", 978, TYPE.NOVEL, false, 5, 5);
        Book book2 = new Book("Java: The Complete Reference", "Herbert Schildt", 123, TYPE.ALBUM, false, 2, 55);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", 432, TYPE.NOVEL, true, 3, 43);
        Book book4 = new Book("Clean Code", "Robert C. Martin", 610, TYPE.NOVEL, true, 4, 52);

        Library library = new Library();


        library.addNewBook(book1);
        library.addNewBook(book2);
        library.addNewBook(book3);
        library.addNewBook(book4);
        library.addNewBook(book22);


        //library.deleteBook(2);

        library.sellBook(1);
        library.sellBook(1);
        library.sellBook(1);
        library.sellBook(1);


    }
}
