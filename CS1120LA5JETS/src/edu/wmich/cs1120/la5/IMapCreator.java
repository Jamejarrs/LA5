package edu.wmich.cs1120.la5;


public interface IMapCreator {

	void scanTerrain(String fileName,int threshold);
	TerrainScanner getScanner();
	void setScanner(TerrainScanner scanner);
	
}
