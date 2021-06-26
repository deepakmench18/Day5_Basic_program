package com.bridgelab.program;
import com.bridgelab.utility.Triplet_number;
public class Triplet {

	public static void main(String[] args) {
		Triplet_number obj = new Triplet_number();
		System.out.println("Enter Number");
		int N = obj.getValue();
		int[] arr = new int[20];
		System.out.println("Enter Number" + N);
		for(int i = 0; i <= N; i++)
		{
			arr[i] = obj.getValue();
		}
		obj.triplet_number(N,arr);

	}


}
