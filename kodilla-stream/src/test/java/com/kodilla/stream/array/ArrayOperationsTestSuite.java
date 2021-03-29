package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverange() {
        //Given
        int[] numbers = {10, 13, 21, 75, 5, 1, 93, 8};
        //When
        double average = getAverage(numbers);
        //Then
        Assert.assertEquals(28.25, average, 0.001);
    }
}
