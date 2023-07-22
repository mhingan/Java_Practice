package org.example.IO.CSVProcessor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVFileProcessor {
    public List<Person> processFile(String fileName) {
        try {
            List<Person> personList = new ArrayList<>();

            BufferedReader bReader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = bReader.readLine()) != null) {
                String token[] = line.split(",");
                Person person = new Person(
                        token[0],
                        token[1],
                        token[2],
                        token[3],
                        token[4]

                );

                personList.add(person);
            }
            bReader.close();
            return personList;



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
