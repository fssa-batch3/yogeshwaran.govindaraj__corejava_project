package day08.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class TestRepeatedKeyCounter {

    @Test
    public void testRepeatedKeyCounter() {
        // Given
        String[] input = { "Ram", "Ram", "Superman", "spider", "hey", "hello", "hey", "Spider" };

        // When
        HashMap<String, Integer> nameCount = new HashMap<>();

        for (String name : input) {
            nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
        }

        // Then
        HashMap<String, Integer> expectedNameCount = new HashMap<>();
        expectedNameCount.put("Ram", 2);
        expectedNameCount.put("Superman", 1);
        expectedNameCount.put("spider", 1);
        expectedNameCount.put("hey", 2);
        expectedNameCount.put("hello", 1);
      //  expectedNameCount.put("Spider", 1);

        Assertions.assertEquals(expectedNameCount, nameCount);
    }
}
