package com.app;

import static org.junit.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestMain {

	@Test
	public void testInputIsEven()
	{
		assertTrue(Main.checkIFInputIsAnEvenNumber(23));//Assertion
	}
	
}
