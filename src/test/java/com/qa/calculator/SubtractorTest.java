package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class SubtractorTest {
	private Subtractor subtractor;

	@Test
	public void subtractTest() {
		subtractor = new Subtractor();
		int expectedValue = 2;
		int actualValue = subtractor.subtract(4, 2);
		Assert.assertEquals(expectedValue,actualValue);
	}

}




