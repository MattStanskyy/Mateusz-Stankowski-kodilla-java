package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public static List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> oddNumbersList = new ArrayList<>();
        if (numbers == null) {
            return oddNumbersList;
        }
        for (Integer number : numbers) {
            oddNumbersList.add(number);
            if (number % 2 == 1) {
                oddNumbersList.remove(number);
            }
        }
        return oddNumbersList;
    }
}
