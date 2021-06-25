package com.bridgelabz.utility;

import java.util.Scanner;

public class Utility {
	Scanner scanner;
	public Utility()
	{
		scanner = new Scanner(System.in);
	}
	public int getIntvalue()
	{
		return scanner.nextInt();
	}
	public void remainder(int dividend, int divisor)
	{
		int X = dividend % divisor;
		System.out.println(X);
	}
	public void Quotient(int dividend, int divisor)
	{
		int Y = dividend / divisor;
		System.out.println(Y);
	}

}
