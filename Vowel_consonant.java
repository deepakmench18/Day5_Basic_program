package com.bridgelabz.utility;
import java.util.Scanner;
public class Vowel_consonant {
	Scanner scanner;
	public Vowel_consonant()
	{
		scanner = new Scanner(System.in);
	}
	public String getIntvalue()
	{
		return scanner.nextLine();
	}
	public void vowel_consonant(String x)
	{
		if (x == "a" || x == "e" || x == "i" || x == "o" || x == "u")
		{
			System.out.println("This is Vowel:  " + x);
		}
		else if (x == "A" || x == "E" || x == "I" || x == "O" || x == "U")
		{
			System.out.println("This is Vowel:  " + x);
		}
		else
		{
			System.out.println("This is Consonant:   " + x);
		}
	}

}
