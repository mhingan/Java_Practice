package org.example.Books_Library.Exceptions;

public class BookNotFoundException extends Exception{
    public BookNotFoundException(String message){
        System.out.println(message);
    }
}
