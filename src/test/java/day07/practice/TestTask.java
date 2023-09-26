package day07.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestTask {

	@Test
	public void checkArrayListTaskNameData() {
		Task one = new Task(1, "Swimming", "2023-07-22");
		System.out.println("The task name is : Finish report");
		if (one.getName().equals(one.name)) {
			System.out.println("Pass");

		} else {
			System.out.println("Fail");

		}

		assertEquals(one.getName(), one.name);
	}

	@Test
	public void checkArrayListTaskDeadlineData() {
		Task one = new Task(1, "Swimming", "2023-07-22");
		System.out.println("The task deadline is 2023-07-22");

		if (one.getDeadLine().equals(one.getDeadLine())) {
			System.out.println("Pass");

		} else {
			System.out.println("Fail");

		}

		assertEquals(one.getDeadLine(), one.deadline);
	}

	@Test
	public void checkArrayListTaskIdData() {
		Task one = new Task("Swimming", 1, "2023-07-22");
		System.out.println("The task ID is " + 1);
		if (one.getId() == one.id) {
			System.out.println("Pass");

		} else {
			System.out.println("Fail");

		}

		assertEquals(one.getId(), one.id);
	}

}
