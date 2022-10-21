package com.swe.gamifiedcalendar;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class GamifiedCalendarApplicationTests {

	@Autowired
	private GamifiedCalendarApplication controller;

	@Test
	void contextLoads() {
	}

	@Test
	void customTests() {
		assertEquals(1, 1);
	}

}
