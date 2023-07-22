package org.example.IO.KeyboardProcessor;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        KeyboardHandler keyboardHandler = new KeyboardHandler();
        keyboardHandler.putDataTo("src/main/resources/IO/ex2/keyboardOutput.txt");
    }
}
