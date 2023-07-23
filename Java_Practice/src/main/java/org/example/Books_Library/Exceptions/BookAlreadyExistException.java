package org.example.Books_Library.Exceptions;

public class BookAlreadyExistException extends Exception{
    public BookAlreadyExistException(){
        System.out.println("Book already exist in Library.");
    }
}
