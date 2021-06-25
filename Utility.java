package com.bridgelab.utility;

import java.util.Scanner;

public class Utility {
	Scanner scanner;
	public Utility()
	{
		scanner = new Scanner(System.in);
	}
	public double getDouble()
	{
		 return scanner.nextDouble();
	}
	public boolean getBoolean()
	{
		return scanner.nextBoolean();
	}
	public int getValue()
	{
		return scanner.nextInt();
	}
	public <T> void print2DArray(T[][] inputArray, int rows, int columns) {
		for (int i =0;i<rows;i++)
		{
			for (int j =0;j<columns;j++)
			{ 
				System.out.print(inputArray[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}