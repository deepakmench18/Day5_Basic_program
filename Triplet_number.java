package com.bridgelab.utility;

import java.util.Scanner;

public class Triplet_number {
	Scanner scanner;
	public Triplet_number() {
		scanner = new Scanner(System.in);
	}
	public int getValue()
	{
		return scanner.nextInt();
	}
	public void triplet_number(int N,int[] arr)
	{ 
		for(int i = 0; i <= N;i++)
		{
			for(int j = i+1; j <= N;j++)
			{
				for(int k = j+1; k <= N; k++)
				{
					if( arr[i] + arr[j] + arr[k] == 0)
					{
					System.out.println(arr[i] + "" + arr[j] + "" + arr[k]);
					}
				}
			}
		}
	}

}
