package edu.wmich.cs1120.la5;

import java.io.*;

import edu.wmich.cs1120.la5.TerrainScanner;

public class MapCreatorFromDat implements IMapCreator {

	TerrainScanner scanner = new TerrainScanner();
	
	double currentBasicEnergy;
	double currentElevation;
	double currentRadiation;
	
	/**
	 * Scans terrain using input data from file to determine what terrain is impassable if its elevation is over the threshold
	 * @param fileName Name of text file used to create map, holding double values for each area's elevation, radiation, and basic energy cost
	 * @param threshold Number input in GUI, used to determine what terrain is impassable if the terrain is over the threshold
	 */
	public void scanTerrain(String fileName, int threshold) throws IOException {
		RandomAccessFile randomFile = new RandomAccessFile(fileName, "r");
		IArea[][] terrain = new IArea[10][10];
		int val1;
		int val2;
		char op;
		int startingByte = 0;
		int totalBytes = (Integer.BYTES * 2) + (Double.BYTES * 3) + 2;
		for (int row = 0; row < 10; row ++) {
			for (int col = 0; col < 10; col++) {
				randomFile.seek(startingByte);
				currentBasicEnergy =randomFile.readDouble(); 
				currentElevation =randomFile.readDouble(); 
				currentRadiation =randomFile.readDouble(); 
				op = randomFile.readChar();
				val1 = randomFile.readInt();
				val2 = randomFile.readInt();
			
				if (currentRadiation >= 0.5 || currentElevation > threshold * 0.5)
					terrain[row][col] = new HighArea();
				else
					terrain[row][col] = new LowArea();
				
				terrain[row][col].setBasicEnergyCost(currentBasicEnergy);
				terrain[row][col].setElevation(currentElevation);
				terrain[row][col].setRadiation(currentRadiation);
				
				startingByte = (ExpressionFactory.getExpression(op, val1, val2).getValue()) * totalBytes;
			}
		}
		scanner.setTerrain(terrain);
		randomFile.close();
	}

	/**
	 * Retrieves address for object of TerrainScanner class
	 * @return terrainScan Returns the address for an object of the TerrainScanner class.
	 */
	public TerrainScanner getScanner() {
		return scanner;
	}

	/**
	 * Saves address for object of the TerrainScanner class to MapCreator class.
	 * @param scanner Address for an object of the TerrainScanner class.
	 */
	public void setScanner(TerrainScanner scanner) {
		this.scanner = scanner;
		
	}

}
