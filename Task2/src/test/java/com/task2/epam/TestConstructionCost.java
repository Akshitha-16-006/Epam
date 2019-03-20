package com.task2.epam;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestConstructionCost {
	ConstructionCost obj=new ConstructionCost();
	@Test
	public void testCalc() {
		assertEquals(3000000, obj.calc("standard materials", 2500, "Fully Automated Home"));
		assertEquals(3000000, obj.calc("standard materials", 2500, "Not Fully Automated Home"));
		assertEquals(4500000, obj.calc("high standard materials", 2500, "Not Fully Automated Home"));
		assertEquals(6250000, obj.calc("high standard materials", 2500, "Fully Automated Home"));
		assertEquals(3750000, obj.calc("above standard materials", 2500, "Fully Automated Home"));
		assertEquals(3750000, obj.calc("above standard materials", 2500, "Not Fully Automated Home"));	
	}

}
