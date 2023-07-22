package org.example.IO.FileReaderWriterApp;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileToTranscribe = "src/main/resources/IO/ex1/fileToTranscribe.txt";
        String fileTranscribed = "src/main/resources/IO/ex1/fileTranscribed.txt";

        FileHandlerApp fileHandlerApp = new FileHandlerApp();
        fileHandlerApp.transcribe(fileToTranscribe, fileTranscribed);
    }
}
