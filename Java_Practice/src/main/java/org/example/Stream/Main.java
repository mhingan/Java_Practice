package org.example.Stream;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SHandler sHandler = new SHandler();
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,0);

        sHandler.returnEvenNumbersFromList(numbers);
    }
}
