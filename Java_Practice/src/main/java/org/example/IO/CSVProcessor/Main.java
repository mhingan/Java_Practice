package org.example.IO.CSVProcessor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String file = "src/main/resources/IO/ex3/PersonsInfo.csv";
        CSVFileProcessor csvFileProcessor = new CSVFileProcessor();
        List<Person> personList = csvFileProcessor.processFile(file);

        //using lambda, sort the list by first name
        personList.sort((a, b) -> a.getFirstName().compareTo(b.getFirstName()));

        System.out.println(personList);



    }
}
