package com.rajivsingh.learning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JenkinsCalculatorTest {

	JenkinsCalculator jc = new JenkinsCalculator();
	
	@Test
	public void testaddNumbers() {
		
		
		assertEquals(45,jc.addNumbers(23, 22));
	}
	
	@Test
	public void testSubtractNumbers() {
		
		
		assertEquals(45,jc.subtractNumbers(91, 46));
	}


}
