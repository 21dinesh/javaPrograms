package Assigment2;

import java.util.Arrays;

public class IntRightRotaion {
public static void main(String[] args) {
	int [] ar= {22,30,14,95,64,73,97};
    for (int i = 0; i <=1; i++) {
    	int temp=ar[0];
    	for (int j = 1; j < ar.length; j++) {
			ar[j-1]=ar[j];
		}
		ar[ar.length-1]=temp;
	}
	
	System.out.println(Arrays.toString(ar));
}
}
