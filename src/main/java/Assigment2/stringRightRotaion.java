package Assigment2;

import java.util.Arrays;

public class stringRightRotaion {
	public static void main(String[] args) {
		String s="rajasthan has thar desert";
		String[] s1=s.split(" ");	
		
		for (int j = 0; j < 2; j++) {
			String temp=s1[s1.length-1];
			
			for(int i= s1.length-1;i>0;i--) {
				s1[i] =s1[i-1];
			}
			s1[0]=temp;

		}System.out.println(Arrays.toString(s1));
		
	}

}
