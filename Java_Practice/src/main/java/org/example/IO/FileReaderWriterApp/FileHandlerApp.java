package org.example.IO.FileReaderWriterApp;

import java.io.*;

public class FileHandlerApp {
    public  void transcribe(String fileReaderName, String fileWriterName) throws IOException {
        BufferedReader bReader = new BufferedReader(new FileReader(fileReaderName));
        BufferedWriter bWriter = new BufferedWriter(new FileWriter(fileWriterName));
        String line;

        while((line = bReader.readLine()) != null){
            System.out.println("Writing data to " + fileWriterName + ": in progress...");
            bWriter.write(line);
        }
        System.out.println("Writing data to " + fileWriterName + ": SUCCESS!");
        bWriter.close();
        bReader.close();

    }
}
