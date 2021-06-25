package com.bridgelab.program;
import com.bridgelab.Utility.utility;
public class Leap_year_oops {

	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter your Year");
		int ValueOfYear = utility.getIntValue();
	    utility.checkLeapYear(ValueOfYear);

	}

}
