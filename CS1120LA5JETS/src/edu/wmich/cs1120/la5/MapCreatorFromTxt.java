package edu.wmich.cs1120.la5;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

import edu.wmich.cs1120.la5.TerrainScanner;

public class MapCreatorFromTxt implements IMapCreator {

	TerrainScanner terrainScan = new TerrainScanner();
	
	double currentBasicEnergy;
	double currentElevation;
	double currentRadiation;
	
	/**
	 * Scans terrain using input data from file to determine what terrain is impassable if its elevation is over the threshold
	 * @param fileName Name of text file used to create map, holding double values for each area's elevation, radiation, and basic energy cost
	 * @param threshold Number input in GUI, used to determine what terrain is impassable if the terrain is over the threshold
	 */
	public void scanTerrain(String fileName, int threshold) throws IOException {
		
		File reader = new File(fileName);
		Scanner scanner = new Scanner(reader);
		IArea[][] terrain = new IArea[10][10];
		
		
		for (int row = 0; row < 10; row++) {
			for (int col = 0; col < 10; col++) {
				
				currentBasicEnergy = scanner.nextDouble();
				currentElevation = scanner.nextDouble();
				currentRadiation = scanner.nextDouble();
				
				if (currentRadiation >= 0.5 || currentElevation > threshold * 0.5)
					terrain[row][col] = new HighArea();
				else
					terrain[row][col] = new LowArea();
				
				terrain[row][col].setBasicEnergyCost(currentBasicEnergy);
				terrain[row][col].setElevation(currentElevation);
				terrain[row][col].setRadiation(currentRadiation);
				
		
			}
		}
		terrainScan.setTerrain(terrain);
		
		scanner.close();
	}
	
	/**
	 * Retrieves address for object of TerrainScanner class
	 * @return terrainScan Returns the address for an object of the TerrainScanner class.
	 */
	public TerrainScanner getScanner() {
		return terrainScan;
	}
	
	/**
	 * Saves address for object of the TerrainScanner class to MapCreator class.
	 * @param scanner Address for an object of the TerrainScanner class.
	 */
	public void setScanner(TerrainScanner scanner) {
		terrainScan = scanner;
	}

}
