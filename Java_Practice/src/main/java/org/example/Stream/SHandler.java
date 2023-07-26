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


    public void exercise2(){
        List<String> cars = Arrays.asList("bmw x6", "audi r x8", "mercedes benz 3", "bmw x2", "BMW m3", "logan 3");
        List<String> bmw = cars.stream()
                .map(String::toUpperCase)
                .filter(car -> car.contains("bmw"))
                .collect(Collectors.toList());
        System.out.println(bmw);



    }
}
