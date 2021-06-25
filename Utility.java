package com.bridgelab.utility;

import java.util.Scanner;

public class Utility {
        Scanner scanner;
        public utility() {
        	scanner = new Scanner(System.in);
        }
        public int getIntValue() {
        	return scanner.nextInt();
        }
        public void checkLeapYear(int ValueOfYear) {
        	int temp = ValueOfYear , noOfDigit = 0;
        	do {
        		noOfDigit++;
        		ValueOfYear = ValueOfYear/10;
        	}while(ValueOfYear != 0);
        	if (noOfDigit == 0) 
        	{
        		if ((temp % 4 == 0 || (temp % 400 == 0 && temp % 100 == 0)) {
                     System.out.print.ln("Year is Leap:" + temp);
        		}
        		else {
        			System.out.println("Year is Not Leap " + temp);
        		} }
        	else {
        		System.out.println("Year is Invalid" + temp);
        	}
        }
}
