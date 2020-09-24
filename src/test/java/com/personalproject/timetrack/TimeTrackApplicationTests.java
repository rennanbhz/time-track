package com.personalproject.timetrack;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
class TimeTrackApplicationTests {

	@Value("${pagination.quantity}")
	private int quantityPerPages;

	@Test
	void contextLoads() {
	}

	@Test
	void testCurrentContext_shouldReturn_Context() {
		assertEquals (100, quantityPerPages);
	}

}
