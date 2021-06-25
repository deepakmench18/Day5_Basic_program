package com.bridgelabz.utility;

import java.util.Scanner;

public class Check {
	Scanner scanner;
	public Check()
	{
		scanner = new Scanner(System.in);
	}
	public int getIntvalue()
	{
		return scanner.nextInt();
	}
	public void even_odd(int N)
	{
		if (N % 2 == 0)
		{
			System.out.println("Nuber is Even" + N);
		}
		else
		{
			System.out.println("Number is Odd" + N);
		}
	}

}
