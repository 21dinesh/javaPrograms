package Assigment2;

import java.util.Arrays;

public class IntLeftRotaion {
	public static void main(String[] args) {
		int [] a= {2,4,0,7,4,0,8,0,9};
		
		for (int i = 0; i <=1; i++) {
			int temp=a[0];
			for (int j = 1; j < a.length; j++) {
				a[j-1]=a[j];
				
			}
			a[a.length-1]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
