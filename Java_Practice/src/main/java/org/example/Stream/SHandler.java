package org.example.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SHandler {
    public void exercise1(List<Integer> list) {
        List<Integer> evenNumbers = list.stream()
                .filter(s -> s % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers are: " + evenNumbers);
    }


    public void exercise2() {
        List<String> cars = Arrays.asList("bmw x6", "audi r x8", "mercedes benz 3", "bmw x2", "BMW m3", "logan 3");
        List<String> bmw = cars.stream()
                .filter(car -> car.contains("bmw") || car.contains("BMW"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(bmw);


    }

    public void exercise3() {
        List<String> names = Arrays.asList("Mara","Ion","Vasile","Ionela","Mirela","Ana","Marius","Mirel","Ana","Marcela");
        List<String> girls = names.stream()
                .filter(name -> name.endsWith("a"))
                .toList();

        System.out.println("The following persons from list might be girls since the name is ending with 'a' : " + girls);


    }
}
