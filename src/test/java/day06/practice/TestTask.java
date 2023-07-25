package day06.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestTask {

    @Test
    public void testToString() {
        // Given
        Task task1 = new Task("learn Core Java", 3);
        Task task2 = new Task("Lunch", 1);
        Task task3 = new Task("FacePrep", 3);

        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);

        // When
        String expectedOutput = "Task Name : learn Core Java Priority : 3\n"
                + "Task Name : Lunch Priority : 1\n"
                + "Task Name : FacePrep Priority : 3\n";

        StringBuilder actualOutput = new StringBuilder();
        for (Task task : tasks) {
            actualOutput.append(task.toString());
        }

        // Then
        Assertions.assertEquals(expectedOutput, actualOutput.toString());
    }
}
