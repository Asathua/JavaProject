package com.arun.TestCase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.arun.model.Greeter;

public class MockStaticExampleTest {
	@Test
	public void mockStaticExample() throws Exception {
		String expected ="Greetings Arun";
		assertEquals(expected, Greeter.getGreeting("Arun"));
		
	}
}
