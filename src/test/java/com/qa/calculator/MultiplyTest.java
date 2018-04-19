package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class MultiplyTest {
	private Multiply multiply;

	@Test
	public void multiplyTest() {
		multiply = new Multiply();
		int expectedValue = 12;
		int actualValue = multiply.multiply(6, 2);
		Assert.assertEquals(expectedValue,actualValue);
	}
}
