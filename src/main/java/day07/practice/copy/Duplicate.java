package day07.practice.copy;
import java.util.ArrayList;
import java.util.HashSet;

public class  Duplicate{
	public static void main(String[] args) {
        
        ArrayList<Integer> numbersList = new ArrayList<>();
        
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(2);
        numbersList.add(4);
        numbersList.add(3);
        numbersList.add(5);

        
        HashSet<Integer> uniqueNumbersSet = new HashSet<>(numbersList);

        
        System.out.println("Unique values:");
        for (int num : uniqueNumbersSet) {
            System.out.println(num);
        }
    }
}
