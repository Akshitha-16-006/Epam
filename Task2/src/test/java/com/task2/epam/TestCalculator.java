package com.task2.epam;
import com.task2.epam.*;
import static org.junit.Assert.*;
import org.junit.Test;

import junit.framework.Assert;

public class TestCalculator {
	Calculator cal=new Calculator();
	@Test
	public void testAddition() {
		
		assertEquals(37,cal.add(31,6));
		assertEquals(25,cal.add(31,-6));
		assertEquals(-25,cal.add(-31,6));
		assertEquals(-37,cal.add(-31,-6));
		assertEquals(0,cal.add(31,-31));
	}
	@Test
	public void testMultiply() {
		assertEquals(183,cal.mul(31,6));
		assertEquals(-183,cal.mul(31,-6));
		assertEquals(183,cal.mul(-31,-6));
		assertEquals(0,cal.mul(31,0));
	}
	@Test
	public void testDivision() {
		assertEquals(6,cal.div(30,5));
		assertEquals(-6,cal.div(30,-5));
		assertEquals(-6,cal.div(-30,5));
		assertEquals(6,cal.div(-30,-5));
		assertEquals(0,cal.div(0,30));
	}

}
