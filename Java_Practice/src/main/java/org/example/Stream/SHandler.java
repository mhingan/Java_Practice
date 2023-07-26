package org.example.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SHandler {
    public void returnEvenNumbersFromList(List<Integer> list) {
        List<Integer> evenNumbers = list.stream()
                .filter(s -> s % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers are: " + evenNumbers);


    }
}
