package com.calc;

/*
 * 
 *  Unit-Testing
 *  ------------
 *  
 *  AAA
 *  
 *  A- Arrange
 *  A- Act
 *  A- Assert 
 * 
 */

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator calculator;

	@Before
	public void beforeAnyTest() {
		calculator = new Calculator();
	}

	@Test
	public void addTest() {
		int n1 = 12;
		int n2 = 13;
		int actual = calculator.add(n1, n2);
		assertEquals(25, actual);
	}

}
