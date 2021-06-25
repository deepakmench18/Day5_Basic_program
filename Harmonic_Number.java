package com.bridgelab.program;

public class Harmonic_Number {
	static double nthharmonic(int N)
	{
	    float h = 1;
	    for (int i = 1; i <= N; i++)
	    {
	    	h += (float)1 / i;
	    }
	    return h;
	}
	
	public static void main(String[] args) {
		int N = 8;
		System.out.println(nthharmonic(N));
	}
}
