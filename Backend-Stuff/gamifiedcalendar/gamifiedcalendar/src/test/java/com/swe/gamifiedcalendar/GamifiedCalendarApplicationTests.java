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
	void accountTests() {
		Account a = new Account();
		String name = "Do homework";
		a.setTaskname(name);
		assertEquals(name, a.getTaskName());
		assertEquals(1, 1);
		String description = "Java project, chemistry worksheet, physics homework all need to be done";
		a.setTaskDescription(description);
		assertEquals(description, a.getTaskDescription());
		int taskPoints = 5;
		a.setTaskPoints(taskPoints);
		assertEquals(taskPoints, a.getTaskPoints());
		boolean taskStatus = true;
		a.setTaskStatus(taskStatus);
		assertEquals(taskStatus, a.getTaskStatus());

	}

}
