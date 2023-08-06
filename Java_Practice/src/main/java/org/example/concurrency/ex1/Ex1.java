package org.example.concurrency.ex1;

public class Ex1 extends Thread {
    @Override
    public synchronized void run() {
        System.out.println("Hello, " + Thread.currentThread().getName());
    }
}
