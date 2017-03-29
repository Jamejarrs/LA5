package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class EnergyAnalyzer implements IRover {
	private ArrayList<IArea> path;
	private String analysis;
	private double energy;
	/**
	 * This method returns the path
	 * @return path - the path for the given maze
	 */
	@Override
	public ArrayList<IArea> getPath() {
		return path;
	}
	/**
	 * This method sets the path
	 * @param area - The area that is set for the path
	 */
	@Override
	public void setPath(ArrayList<IArea> area) {

		path =area;

		
	}
	/**
	 * This method analyzes the path to calculate the energy
	 */
	@Override
	public void analyzePath() {
		energy = 0;
		for (int index = 0;index<path.size();index++) {
		energy = energy + path.get(index).calcConsumedEnergy();
		}
		setAnalysis(toString());

	}
	/**
	 * This method returns the analysis
	 * @return analysis - the given analysis that is being calculated
	 */
	@Override
	public String getAnalysis() {
		return analysis;
	}
	/**
	 * Sets the analysis
	 * @param analysis - the analysis based on the energy calculator
	 */
	@Override
	public void setAnalysis(String analysis) {
		this.analysis = analysis;

	}
	/** 
	 * Turns the energy to a string in order to be returned
	 * @return energy - energy is returned as a string
	 */
	public String toString(){
		return "" + energy;

	}

}
