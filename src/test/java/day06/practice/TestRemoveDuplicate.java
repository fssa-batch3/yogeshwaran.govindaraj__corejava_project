package day06.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class TestRemoveDuplicate {
		 @Test
		    public void testCityListConversion() {
		        // Given
		        List<String> cityList = new ArrayList<>();
		        cityList.add("Chennai");
		        cityList.add("Mumbai");
		        cityList.add("Bangalore");
		        cityList.add("Kolkata");
		        // When
		        Set<String> set = new LinkedHashSet<>();
		        set.addAll(cityList);
		        cityList.clear();
		        cityList.addAll(set);
		        // Then
		        List<String> expectedCityListFalse = new ArrayList<>();
		        expectedCityListFalse.add("Chennai");
		        expectedCityListFalse.add("Mumbai");
		        expectedCityListFalse.add("Bangalore");
		        
		        List<String> expectedCityListTrue = new ArrayList<>();
		        expectedCityListTrue.add("Chennai");
		        expectedCityListTrue.add("Mumbai");
		        expectedCityListTrue.add("Bangalore");
		        expectedCityListTrue.add("Kolkata");
		        
		       
		        Assertions.assertEquals(expectedCityListFalse, cityList);
		      //  Assertions.assertEquals(expectedCityListTrue, cityList);
		    }
	}