package edu.wmich.cs1120.la5;

public interface IArea {
	double getBasicEnergyCost();
	void setBasicEnergyCost(double basicEnergyCost);
	double getElevation();
	void setElevation(double elevation);
	double getRadiation();
	void setRadiation(double radiation);
	double calcConsumedEnergy();
}
