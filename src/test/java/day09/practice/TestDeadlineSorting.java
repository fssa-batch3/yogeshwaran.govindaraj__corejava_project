package day09.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class TestDeadlineSorting {

    @Test
    public void testDeadlineSorting() {
        // Given
        ArrayList<Task> arr = new ArrayList<>();
        arr.add(new Task(3, "Coding", LocalDate.of(2022, 05, 21)));
        arr.add(new Task(3, "Coding", LocalDate.of(2022, 04, 21)));
        arr.add(new Task(5, "Product Design", LocalDate.of(2022, 10, 01)));
        arr.add(new Task(1, "Software Design", LocalDate.of(2022, 10, 07)));
        arr.add(new Task(3, "Coding", LocalDate.of(2022, 10, 22)));
        arr.add(new Task(3, "Coding", LocalDate.of(2022, 10, 22)));

        // When
        Collections.sort(arr);

        // Then
        ArrayList<Task> expectedSortedArr = new ArrayList<>();
        expectedSortedArr.add(new Task(3, "Coding", LocalDate.of(2022, 05, 21)));
        expectedSortedArr.add(new Task(3, "Coding", LocalDate.of(2022, 04, 21)));
        expectedSortedArr.add(new Task(5, "Product Design", LocalDate.of(2022, 10, 01)));
        expectedSortedArr.add(new Task(1, "Software Design", LocalDate.of(2022, 10, 07)));
        expectedSortedArr.add(new Task(3, "Coding", LocalDate.of(2022, 10, 22)));
        expectedSortedArr.add(new Task(3, "Coding", LocalDate.of(2022, 10, 22)));

        Assertions.assertEquals(expectedSortedArr, arr);
    }
}
