package Assigment2;

import java.util.Arrays;

public class shiftZeroToRight {
	public static void main(String[] args) {
		int []s= {0,2,3,0,5,0,9};
		int nzp=0;
		for (int i = 0; i < s.length; i++) {
			if (s[i]!=0) {
				s[nzp]=s[i];
				nzp++;
			}
			
		}while(nzp<=s.length-1) {
			s[nzp]=0;
			nzp++;
		}System.out.println(Arrays.toString(s));
	}

}
