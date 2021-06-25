package com.bridgelab.utility;

import java.util.Scanner;

public class Greatest {
    Scanner scanner;
    public Greatest()
    {
    	scanner = new Scanner(System.in);
    }
    public int getValue()
    {
    	return scanner.nextInt();
    }
    public void Main(int a, int b, int c)
    {
    	if ( a > b && a > c )
    	{
    		System.out.println("A is Greated Number");
    	}
    	else if ( b > a && b > c)
    	{
    		System.out.println("B is Greatest Number");
    	}
    	else
    	{
    		System.out.println("C is Greatest");
    	}
    }
}
