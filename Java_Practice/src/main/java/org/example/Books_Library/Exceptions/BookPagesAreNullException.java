package org.example.Books_Library.Exceptions;

public class BookPagesAreNullException extends Exception{
    public BookPagesAreNullException(){
        System.out.println("The number of pages is <= 0 or null.");
    }
}
