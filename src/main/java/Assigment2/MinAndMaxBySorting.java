package Assigment2;

import java.util.Arrays;

public class MinAndMaxBySorting {
	public static void main(String[] args) {
		int [] ar= {1,3,2,44,68,9,8,5};
		
		Arrays.sort(ar);
		int minimum=ar[0];
		int maximum=ar[ar.length-1];
		
		System.out.println(minimum + ", "+ maximum);
	}

}
