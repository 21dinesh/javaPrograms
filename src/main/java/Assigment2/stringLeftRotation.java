package Assigment2;

import java.util.Arrays;

public class stringLeftRotation {
	public static void main(String[] args) {
		String s="manual and Automation Engineer";
		String s1[]=s.split(" ");
				
		for (int i = 0; i < 2 ; i++) {
			String temp=s1[s1.length-1];	
			
			for (int j = s1.length-1; j >0 ; j--) {
				s1[j]=s1[j-1];
			
			}
			s1[0]=temp;
						
		}System.out.println(Arrays.toString(s1));
	}

}
