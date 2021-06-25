package com.bridgelabz.program;

import com.bridgelabz.utility.Check;

public class Even_odd {

	public static void main(String[] args) {
		Check obj = new Check();
		System.out.println("Emter Your Number :");
		int N = obj.getIntvalue();
		obj.even_odd(N);
	}
}
