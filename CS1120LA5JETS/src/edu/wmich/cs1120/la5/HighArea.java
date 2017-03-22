package edu.wmich.cs1120.la5;

public class HighArea extends Area {
	/**
	 * This method calculates the energy consumed for the area.
	 * @param
	 * @return basicEnergyCost * 4;
	 */
	@Override
	public double calcConsumedEnergy(){
		return getBasicEnergyCost() * 4;
	}
}
