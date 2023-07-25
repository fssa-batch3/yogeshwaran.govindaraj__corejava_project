package day09.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestIntegerSorting {

    @Test
    public void testIntegerSorting() {
        // Given
        List<Integer> integer = new ArrayList<>();
        integer.add(8);
        integer.add(9);
        integer.add(45);
        integer.add(12);
        integer.add(1);
        integer.add(5);

        // When
        Collections.sort(integer);

        // Then
        List<Integer> expectedSortedInteger = new ArrayList<>();
        expectedSortedInteger.add(1);
        expectedSortedInteger.add(5);
        expectedSortedInteger.add(8);
        expectedSortedInteger.add(9);
        expectedSortedInteger.add(12);
        expectedSortedInteger.add(45);

        Assertions.assertEquals(expectedSortedInteger, integer);
    }
}