package com.bridgelabz.programs;
import com.bridgelabz.utility.Utility;
public class Flipcoin {

	public static void main(String[] args) {
			Utility utility = new Utility();
			System.out.println("Enter number of time to flip");
			int numberOfFlip = utility.getIntValue();
			utility.flipCoin(numberOfFlip);
		}

	}


