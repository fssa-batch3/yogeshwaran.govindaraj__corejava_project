package day10.practice;

public class EmailValidatorTest {
	
//@test

	void test() {
	String email = "ishusankar@gmail.com";
	
	if (validateEmail(email)) {
		System.out.println(email + " is valid");
	}else {
		System.out.println(email + " is not  valid");
	}
	
}

private boolean validateEmail(String email) {
	// TODO Auto-generated method stub
	return false;
}
}

