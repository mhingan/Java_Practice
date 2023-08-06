package org.example.concurrency.ex1;


public class Main {
    /**
     * Create a program that generates 5 threads, and each thread prints "Hello, Thread X" where X is the thread number. Make sure the threads execute concurrently.
     **/
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Ex1();
        thread.start();

        for(int i = 0; i<4; i++){
            Ex1 ex1Thread = new Ex1();
            ex1Thread.start();

            Thread.sleep(900);
        }
    }
}
