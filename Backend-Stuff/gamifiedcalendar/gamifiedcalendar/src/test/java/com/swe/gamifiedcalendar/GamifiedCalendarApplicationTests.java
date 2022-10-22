package com.swe.gamifiedcalendar;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GamifiedCalendarApplicationTests {

	@Autowired
	private GamifiedCalendarApplication controller;

	@Test
	void contextLoads() {
	}

	@Test
	void taskTests() {
		Task t = new Task();
		String name = "Do homework";
		t.setTaskName(name);
		assertEquals(name, t.getTaskName());
		assertEquals(1, 1);
		String description = "Java project, chemistry worksheet, physics homework all need to be done";
		t.setTaskDescription(description);
		assertEquals(description, t.getTaskDescription());
		int taskPoints = 5;
		t.setTaskPoints(taskPoints);
		assertEquals(taskPoints, t.getTaskPoints());
		boolean taskStatus = true;
		t.setTaskStatus(taskStatus);
		assertEquals(taskStatus, t.getTaskStatus());

	}

	@Test
	void accountTests() {
		Account a = new Account();

	}

}
