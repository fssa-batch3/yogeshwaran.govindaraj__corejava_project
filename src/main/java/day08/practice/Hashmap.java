package day08.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hashmap {
    public static void main(String[] args) {
    	// MAP IS TO COUNT
        Map<String, Integer> nameCountMap = new HashMap<>();
        
      // ASK THE INPUT FROM THE USER IN THE STRING WITH NEXTLINE BECAUSE HOW MANY NAME GIVE WE CAN SPLIT IT USING ","   
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();
        
        // AFTER THAT STORE IT IN THE ARRAY TO RUN THE LOOP FOR THE COUNT
        String[] names = input.split(",\\s*");
        
        //NOW WE CREATE THE FOR EACH LOOP
        //NAMECOUNT FROM THE MAP METHOD IT CAN COUNT
        // AND TRIM() TO AVOID SPACE AND TOLOWERCASE IS TO CONVERT ALL INTO LOWERCASE AND COUNT IT
        for (String name : names) {
            nameCountMap.put(name.toLowerCase().trim(), nameCountMap.getOrDefault(name.toLowerCase().trim(), 0) + 1);
        }

        // WHEN PRINT THAT AS USUALL WHAT WE GOT FROM THE SCANNER
        for (Map.Entry<String, Integer> entry : nameCountMap.entrySet()) {
            String name = entry.getKey();
            int count = entry.getValue();
            System.out.println(name + ": " + count);
        }
    }
}