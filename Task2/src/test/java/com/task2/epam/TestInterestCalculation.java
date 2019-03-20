package com.task2.epam;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestInterestCalculation {

	@Test
	public void testCalSimpleInterest() {
		InterestCalculation ic=new InterestCalculation();
		assertEquals(1515.1500244140625,ic.calSimpleInterest(20202, 2.5f,3));
	}

	@Test
	void testCalCompoundInterest() {
		InterestCalculation ic=new InterestCalculation();
		assertEquals(21755.342888139312,ic.calCompoundInterest(20202, 2.5f,3));
	}


}
