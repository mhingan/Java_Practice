package org.example.Stream;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SHandler {
    public void exercise1(List<Integer> list) {
        List<Integer> evenNumbers = list.stream()
                .filter(s -> s % 2 == 0)
                .toList();
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
        List<String> names = Arrays.asList("Mara", "Ion", "Vasile", "Ionela", "Mirela", "Ana", "Marius", "Mirel", "Ana", "Marcela");
        List<String> girls = names.stream()
                .filter(name -> name.endsWith("a"))
                .toList();

        System.out.println("The following persons from list might be girls since the name is ending with 'a' : " + girls);


    }

    public void exercise4() {
        PersonC personC = new PersonC("Mihai", "And", "29.04.2002", "Student", "m");
        PersonC personC2 = new PersonC("Andrei", "Mare", "12.04.2000", "IT", "M");
        PersonC personC3 = new PersonC("Mara", "Juliana", "21.04.2002", "Student", "f");
        PersonC personC4 = new PersonC("Mircea", "Cristian", "11.01.2001", "Sales Consulting", "m");
        List<PersonC> personCList = Arrays.asList(personC, personC2, personC3, personC4);
        List<String> sortedList = personCList.stream()
                .map(pers -> pers.getGender().toUpperCase())
                .sorted()
                .toList();
        System.out.println(sortedList);
    }

    public void exercise5() {
        //find the even numbers and square them
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        List<Integer> evenNumber = integers.stream()
                .filter(nr -> nr % 2 == 0)
                .map(nr -> nr * nr)
                .toList();

        System.out.println(evenNumber);
    }

    public void exercise6() {
        //sort numbers descending and print the first 3
        List<Integer> integers = Arrays.asList(21, 45, 33, 12, 56, 98, 77, 34, 9);
        List<Integer> sortedList = integers.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();

        System.out.println(sortedList);
    }

}
