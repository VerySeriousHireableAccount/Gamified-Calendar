package com.swe.gamifiedcalendar;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.mockito.*;
import static org.junit.jupiter.api.Assertions.*;

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
		// Getters, setters, and constructor tests
		Account acc = new Account("martingarrix", "grx@gmail.com", "highonlife");
        assertEquals("martingarrix", acc.getUsername());
        assertEquals("grx@gmail.com", acc.getEmail());
        assertEquals("highonlife", acc.getPassword());
        assertEquals(0, acc.getBestStreak());
        assertEquals(0, acc.getCurrentStreak());
        assertEquals(0, acc.getTotalPoints());

		acc.setAccountID(3);
        acc.setBestStreak(10);
        acc.setCurrentStreak(5);
        acc.setTotalPoints(100);
        assertEquals(3, acc.getAccountID());
        assertEquals(10, acc.getBestStreak());
        assertEquals(5, acc.getCurrentStreak());
        assertEquals(100, acc.getTotalPoints());

        acc.setUsername("grx");
        acc.setEmail("martin@gmail.com");
        acc.setPassword("pizza");
        assertEquals("grx", acc.getUsername());
        assertEquals("martin@gmail.com", acc.getEmail());
        assertEquals("pizza", acc.getPassword());

		// Test equals()
		Account acc1 = new Account("martingarrix", "grx@gmail.com", "highonlife");
        acc1.setCurrentStreak(8);

        Account acc2 = new Account(null, null, null);
        acc2.setUsername("martingarrix");
        acc2.setEmail("grx@gmail.com");
        acc2.setPassword("highonlife");
        acc2.setCurrentStreak(8);

        assertTrue(acc1.equals(acc2));

        Account acc3 = new Account("martingarrix", "grx@gmail.com", "highonlife");
        assertFalse(acc1.equals(acc3));
	}

}
