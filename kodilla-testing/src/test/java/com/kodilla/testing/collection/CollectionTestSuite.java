package com.kodilla.testing.collection;

//import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test case: end");
    }

    @DisplayName("When list without any numbers, called emptyList, is formed, then exterminate function should return empty list")
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> emptyList = new ArrayList<>(Arrays.asList());
        //When
        List<Integer> numbersList = OddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing: " + emptyList);
        System.out.println("Showing result: " + numbersList);
        //Then
        Assertions.assertEquals(emptyList, numbersList);
    }

    @DisplayName("When list with odd and even numbers, called normalList, is formed, then exterminate function should return odd numbers list")
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> normalList = new ArrayList<>(Arrays.asList(123, 2, 1021, 77, 1, 512, 46, 5668));
        List<Integer> exterminateList = new ArrayList<>(Arrays.asList(2, 512, 46, 5668));
        //When
        List<Integer> numbersList = OddNumbersExterminator.exterminate(normalList);
        System.out.println("Testing list " + normalList);
        System.out.println("Showing list after removed odd numbers: " + numbersList);
        //Then
        Assertions.assertEquals(exterminateList, numbersList);
    }
}
