package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class RadiationAnalyzer implements IRover {
	private ArrayList<IArea> path;
	private String analysis;
	private double radiation;
	/**
	 * Retrieves address of ArrayList<IArea>
	 * @return path Address of ArrayList<IArea>
	 */
	@Override
	public ArrayList<IArea> getPath() {
		return path;
	}
	/**
	 * Analyzes path for elevation
	 * @param area Address of ArrayList<IArea>
	 */
	@Override
	public void setPath(ArrayList<IArea> area) {
		path = area;
	}
	/**
	 * Gets average elevation for path and sets it to elevationAnalysis attribute
	 */
	@Override
	public void analyzePath() {
		for (int i =0;i<path.size();i++){
			radiation = (radiation + path.get(i).getRadiation()) / path.size();
		}
		setAnalysis(toString());
		
	}
	/**
	 * Gets analysis of average elevation
	 */
	@Override
	public String getAnalysis() {
		return analysis;
	}
	/**
	 * Sets analysis based on analyzePath() result
	 */
	@Override
	public void setAnalysis(String analysis) {
		this.analysis = analysis;
		
	}
	/**
	 * Converts result of analyzePath() to a string
	 */
	public String toString(){
		return "" + radiation;
	}

}
