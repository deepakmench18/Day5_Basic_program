package com.bridgelab.program;

import java.util.Scanner;

public class Power_of_factor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int p = 1 , i = 0;
		if ((n > 0) && (n < 31)) {
    	while (i <= n)
    	{
    		System.out.println(i + " " + p);
    		p = 2 * p;
    		i = i + 1;
    	}
		}
	}

}
