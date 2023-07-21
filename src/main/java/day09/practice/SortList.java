package day09.practice;

import java.util.ArrayList;
import java.util.Collections;

public class SortList {
	public static void main(String[]args) {
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(8);
		number.add(9);
		number.add(45);
		number.add(12);
		number.add(1);
		
		System.out.println("befor sort :" + " " + number);
		Collections.sort(number);
		System.out.println("After sort :" + " " +number);
	}
	}

