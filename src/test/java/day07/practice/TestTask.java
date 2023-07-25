package day07.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class TestTask {

    @Test
    public void testEqualsAndHashCode() {
        // Given
    	tasks.add(new Task(1, "yogesh", "2023-07-20"));
		tasks.add(new Task(2, "maari", "2023-05-29"));
		tasks.add(new Task(3, "dinesh", "2023-05-29"));
		tasks.add(new Task(3, "abi", "2023-11-09"));

        // When
        // Test equals() method
        boolean task1EqualsTask2 = task1.equals(task2);
        boolean task1EqualsTask3 = task1.equals(task3);

        // Test hashCode() method
        int task1HashCode = task1.hashCode();
        int task2HashCode = task2.hashCode();
       // int task2HashCode = task3.hashCode();
        
        // Then
        // Check if task1 is equal to task2 and task1 is not equal to task3
        Assertions.assertTrue(task1EqualsTask2);
        Assertions.assertFalse(task1EqualsTask3);

        // Check if the hash codes of task1 and task2 are the same since they are equal
        Assertions.assertEquals(task1HashCode, task2HashCode);
    }
}
