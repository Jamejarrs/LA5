package edu.wmich.cs1120.la5;

public class LowArea extends Area{
	/**
	 * This method calculates the consumed energy for the area
	 * @param 
	 * @return basicEnergyCost * 2
	 */
	@Override
	public double calcConsumedEnergy(){
		return getBasicEnergyCost() * 2;
	}
}
