package edu.wmich.cs1120.la5;

import java.io.*;

public class MapCreatorFromDat implements IMapCreator {

	TerrainScanner scanner = new TerrainScanner();
	
	double currentBasicEnergy;
	double currentElevation;
	double currentRadiation;
	
	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		FileInputStream fStream = new FileInputStream(fileName);
		DataInputStream input = new DataInputStream(fStream);
		IArea[][] terrain = new IArea[10][10];
		int val1;
		int val2;
		char op;
		
		for (int row = 0; row < 10; row++) {
			for (int col = 0; col < 10; col++) {
				
				currentBasicEnergy =input.readDouble(); 
				currentElevation =input.readDouble(); 
				currentRadiation =input.readDouble(); 
				val1 = input.readInt();
				op = input.readChar();
				val2 = input.readInt();
				Literal value1 = new Literal(val1);
				Literal value2 = new Literal(val2);
				
				if (currentRadiation >= 0.5 || currentElevation > threshold * 0.5)
					terrain[row][col] = new HighArea();
				else
					terrain[row][col] = new LowArea();
				
				terrain[row][col].setBasicEnergyCost(currentBasicEnergy);
				terrain[row][col].setElevation(currentElevation);
				terrain[row][col].setRadiation(currentRadiation);
				
		
			}
		}
		input.close();
	}

	@Override
	public TerrainScanner getScanner() {
		return scanner;
	}

	@Override
	public void setScanner(TerrainScanner scanner) {
		this.scanner = scanner;
		
	}

}
