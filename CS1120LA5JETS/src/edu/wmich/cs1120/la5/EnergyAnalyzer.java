package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class EnergyAnalyzer implements IRover {
	private ArrayList<IArea> path;
	private String analysis;
	private double energy;
	@Override
	public ArrayList<IArea> getPath() {
		return path;
	}

	@Override
	public void setPath(ArrayList<IArea> area) {
		path =area;
		
	}

	@Override
	public void analyzePath() {
		energy = 0;
		for (int index = 0;index<path.size();index++) {
		energy = energy + path.get(index).calcConsumedEnergy();
		}
		setAnalysis(toString());
	}

	@Override
	public String getAnalysis() {
		return analysis;
	}

	@Override
	public void setAnalysis(String analysis) {
		this.analysis = analysis;
	}
	
	public String toString(){
		return "" + energy;
	}

}
