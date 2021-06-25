package com.bridgelabz.program;
import com.bridgelabz.utility.Vowel_consonant;
public class Alphabet {

	public static void main(String[] args) {
		Vowel_consonant obj = new Vowel_consonant();
		System.out.println("Enter your String");
		String x = obj.getIntvalue();
		obj.vowel_consonant(x);

	}

}

