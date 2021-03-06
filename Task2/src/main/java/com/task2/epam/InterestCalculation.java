package com.task2.epam;

public class InterestCalculation {
	/**
	 * Used to calculate simple Interest	
	 * @param principle
	 * @param rateOfInterest
	 * @param timePeriod
	 * @return
	 */
	public double calSimpleInterest(float principle,float rateOfInterest,float timePeriod)
	{
		return (principle*rateOfInterest*timePeriod)/100;
	}
	/**
	 * Used to calculate Compound Interest
	 * @param principle
	 * @param rateOfInterest
	 * @param timePeriod
	 * @return
	 */
	public double calCompoundInterest(float principle,float rateOfInterest,float timePeriod)
	{
		return principle*(Math.pow((1+rateOfInterest/100), timePeriod));
	}
}
