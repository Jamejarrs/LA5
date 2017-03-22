package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public interface IRover {
	ArrayList<IArea> getPath();
	void setPath(ArrayList<IArea> area);
	void analyzePath();
	String getAnalysis();
	void setAnalysis(String analysis);
	String toString();
}
