package org.example.IO.KeyboardProcessor;

import java.io.*;

public class KeyboardHandler {

    public void putDataTo(String fileName) throws IOException {
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fileWriter = new FileWriter(fileName);

        System.out.println("Write data to store in " + fileName + ". When you finish type: send");
        String line;

        while(!(line = bReader.readLine()).equalsIgnoreCase("send")){
            fileWriter.write(line + "\n");
        }

        System.out.println("Data saved successfully!");
        bReader.close();
        fileWriter.close();


    }
}
