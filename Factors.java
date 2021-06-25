package com.bridgelab.program;
import java.util.Scanner;
public class Factors {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :");
		int N = sc.nextInt();
		for (int i = 2; i <= N; i++)
 		{
 			if (N % i == 0)
 			{
 				int P = 1;
 				for(int j =2; j <= i; j++)
 				{
 					if(i % j ==0)
 					{
 					    P = 0;
 					    break;
 					}
 					
 				}
 				if (P == 1)
	 				{
	 					System.out.println(i);
	 				}
 				
 			}
	}
}
}