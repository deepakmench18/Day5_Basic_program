package com.bridgelabz.program;

import com.bridgelabz.utility.Swap;

public class Swap_two_number {

	public static void main(String[] args) {
		Swap obj = new Swap();
		System.out.println("Enter Value of a  :");
		int a = obj.getIntvalue();
		System.out.println("Enter Valbe of b : ");
		int b = obj.getIntvalue();
		obj.swap(a, b);
		obj.withvar(a, b);
	}

}
