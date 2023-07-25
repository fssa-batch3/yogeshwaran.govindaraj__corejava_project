package day07.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;

public class TestRemoveDuplicate {

    @Test
    public void testRemoveDuplicates() {
        // Given
        ArrayList<Integer> cityNames = new ArrayList<>();
        cityNames.add(1);
        cityNames.add(3);
        cityNames.add(3);
        cityNames.add(1);

        // When
        HashSet<Integer> cityNamesSet = new HashSet<>(cityNames);

        // Then
        ArrayList<Integer> expectedCityNamesList = new ArrayList<>();
        expectedCityNamesList.add(1);
        expectedCityNamesList.add(3);
      //  expectedCityNamesList.add(3);
        
        // Test whether the HashSet contains only unique elements
        Assertions.assertEquals(expectedCityNamesList.size(), cityNamesSet.size());

        // Test whether the contents of the HashSet are as expected
        Assertions.assertTrue(cityNamesSet.containsAll(expectedCityNamesList));
    }
}
