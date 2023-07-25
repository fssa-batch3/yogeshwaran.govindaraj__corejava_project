package day10.practice;

import org.junit.jupiter.api.Test;
public class EmailValidatorTest {
	
@test

	void test() {
	String email = "ishusankar@gmail.com";
	
	if (validateEmail(email)) {
		System.out.println(email + " is valid");
	}else {
		System.out.println(email + " is not  valid");
	}
	
}

