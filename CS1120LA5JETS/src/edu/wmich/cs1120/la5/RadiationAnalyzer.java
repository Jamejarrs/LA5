package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class RadiationAnalyzer implements IRover {
	private ArrayList<IArea> path;
	private String analysis;
	private double radiation;
	@Override
	public ArrayList<IArea> getPath() {
		return path;
	}

	@Override
	public void setPath(ArrayList<IArea> area) {
		path = area;
	}

	@Override
	public void analyzePath() {
		for (int i =0;i<path.size();i++){
			radiation = (radiation + path.get(i).getRadiation()) / path.size();
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
		return "" + radiation;
	}

}
