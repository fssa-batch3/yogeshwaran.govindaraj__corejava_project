package day08.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class testEmployeesList {

    @Test
    public void testEmployeesList() {
        // Given
        HashMap<String, List<String>> departmentMap = new HashMap<>();

        // Sample input data
        String[] input = {
            "HR,Ram",          
            "IT,Basker",
            "HR,Suresh",
            "IT,Joseph",
//            "IT,Sundar",
            "Admin,Sundar"
        };

        // Process input data (same code as in the main method)
        for (String entry : input) {
            String[] parts = entry.split(",");
            String department = parts[0].trim();
            String employee = parts[1].trim();

            List<String> employees = departmentMap.getOrDefault(department, new ArrayList<>());
            employees.add(employee);
            departmentMap.put(department, employees);
        }

        // When
        // Generate output using keySet() (same code as in the main method)
        StringBuilder actualOutput = new StringBuilder();
        for (String department : departmentMap.keySet()) {
            List<String> employees = departmentMap.get(department);

            String employeeList = String.join(", ", employees);
            actualOutput.append(department).append(": ").append(employeeList).append("\n");
        }

        // Then
        // Expected output
        String expectedOutput = "HR: Ram, Suresh\n" +
                                "IT: Basker, Joseph\n" +
                                "Admin: Sundar\n";

        // Test if the actual output matches the expected output
        Assertions.assertEquals(expectedOutput, actualOutput.toString());
    }
}
