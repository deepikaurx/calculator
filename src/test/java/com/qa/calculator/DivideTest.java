package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class DivideTest {
	private Divide divide;

	@Test
	public void DivideTest() {
		divide = new Divide();
		int expectedValue = 4;
		int actualValue = divide.divide(8, 2);
		Assert.assertEquals(expectedValue,actualValue);
	}
	

}
