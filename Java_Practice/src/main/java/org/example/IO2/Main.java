package org.example.IO2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "src/main/resources/IO2/filteredData.txt";
        KeyboardReaderHandler.filterData(fileName);

    }
}
