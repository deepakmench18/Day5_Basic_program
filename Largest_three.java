package com.bridgelab.program;

import com.bridgelab.utility.Greatest;

public class Largest_three {

	public static void main(String[] args) {
		Greatest obj = new Greatest();
		System.out.println("Enter Value of A :");
		int a = obj.getValue();
		System.out.println("Enter Value of B :");
		int b = obj.getValue();
		System.out.println("Enter Value of C :");
		int c = obj.getValue();
        obj.Main(a, b, c);
	}

}
