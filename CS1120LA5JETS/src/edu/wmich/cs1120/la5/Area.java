package edu.wmich.cs1120.la5;

public class Area implements IArea {

	private double basicEnergyCost;
	private double elevation;
	private double radiation;
	/**
	 * This method returns the basic energy cost.
	 * @param 
	 * @return basicEnergyCost
	 */
	@Override
	public double getBasicEnergyCost() {
		return basicEnergyCost;
	}
	/**
	 * This method sets the basic energy cost
	 * @param basicEnergyCost
	 * 					- basic energy cost for that area
	 * @return
	 */
	@Override
	public void setBasicEnergyCost(double basicEnergyCost) {
		this.basicEnergyCost = basicEnergyCost;
		
	}
	/**
	 * This method gets the elevation for the area.
	 * @param
	 * @return elevation
	 */
	@Override
	public double getElevation() {
		return elevation;
	}
	/**
	 * This method sets the elevation for the area.
	 * @param elevation
	 * @return
	 */
	@Override
	public void setElevation(double elevation) {
		this.elevation = elevation;
	}
	/**
	 * This method gets the radiation for the area.
	 * @param
	 * @return radiation
	 */
	@Override
	public double getRadiation() {
		return radiation;
	}
	/**
	 * This method sets the radiation for the area.
	 * @param radiation
	 * @return
	 */
	@Override
	public void setRadiation(double radiation) {
		this.radiation = radiation;
	}
	/**
	 * This method is overridden in the HighArea and LowArea 
	 * @param
	 * @return 0
	 */
	@Override
	public double calcConsumedEnergy() {
		return 0;
	}

}
