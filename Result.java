package com.bridgelabz.program;
import com.bridgelabz.utility.Utility;

public class Result {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter Dividend value :");
		int dividend = utility.getIntvalue();
		System.out.println("Enter Divisor value");
		int divisor = utility.getIntvalue();
		utility.remainder(dividend, divisor);
		utility.Quotient(dividend, divisor);

	}

}
