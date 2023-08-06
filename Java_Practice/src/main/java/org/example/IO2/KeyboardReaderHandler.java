package org.example.IO2;

import java.io.*;
import java.util.Scanner;

public class KeyboardReaderHandler {
    public static void filterData(String fileName) throws IOException {
        BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        String line;


        System.out.println("Insert words: \n");
        while (!(line = keyboardReader.readLine()).equalsIgnoreCase("stop")) {
            int digitsNumber = line.length();
            if (line.matches(".*[0-9].*")) {
                System.out.println("Number found in user input! try again");
                keyboardReader.close();
                writer.close();
            } else if (line.contains(" ")) {
                writer.write("\n" + line + " <-this sentence has " + digitsNumber + " digits (spaces included).");
            } else {
                writer.write("\n" + line + " <-this word has " + digitsNumber + " digits.");
            }
        }
        keyboardReader.close();
        writer.close();


    }


}
