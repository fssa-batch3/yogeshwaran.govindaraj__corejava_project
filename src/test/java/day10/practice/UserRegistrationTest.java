package day10.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

	@Test
	public void checkUserRegistration() {
		UserRegistrationTest userManager = new UserRegistrationTest();
		
		UserRegistrationTest user = new UserRegistrationTest();

		try {
		
			userManager.register(user);
			UserRegistrationTest duplicateUser = new UserRegistrationTest(3, "Jane", "john@example.com");
			userManager.register(duplicateUser);
			assertEquals("alice@gmail.com",user.emailId);
			System.out.println("Registration successfully completed...");
		} catch (UserAlreadyExistsException e) {
			System.out.println("Registration failed");
			System.out.println("Error: " + e.getMessage());
		}
	}

}
