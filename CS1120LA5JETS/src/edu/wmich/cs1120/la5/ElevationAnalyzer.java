package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class ElevationAnalyzer implements IRover {

	ArrayList<IArea> path;
	private double avgElevation;
	String elevationAnalysis;
	
	/**
	 * Retrieves address of ArrayList<IArea>
	 * @return path Address of ArrayList<IArea>
	 */
	public ArrayList<IArea> getPath() {
		return path;
	}

	/**
	 * Analyzes path for elevation
	 * @param area Address of ArrayList<IArea>
	 */
	public void setPath(ArrayList<IArea> area) {
		path = area;
	}

	/**
	 * Gets average elevation for path and sets it to elevationAnalysis attribute
	 */
	public void analyzePath() {
		double totalElevation = 0;
		for (int currentIteration = 0; currentIteration < path.size(); currentIteration++)
			{totalElevation += path.get(currentIteration).getElevation();}
		avgElevation = totalElevation/path.size();
		this.setAnalysis(toString());
	}

	/**
	 * Gets analysis of average elevation
	 */
	public String getAnalysis() {
		return elevationAnalysis;
	}

	/**
	 * Sets analysis based on analyzePath() result
	 */
	public void setAnalysis(String analysis) {
		elevationAnalysis = analysis;
		
	}

	/**
	 * Converts result of analyzePath() to a string
	 */
	public String toString() {
		String returnString = "" + avgElevation;
		return returnString;
	}
}
