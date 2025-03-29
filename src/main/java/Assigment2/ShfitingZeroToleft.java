package Assigment2;

import java.util.Arrays;

public class ShfitingZeroToleft {
	public static void main(String[] args) {
	int[]s= {0,23,4,5,0,0,4,9,8};
	int nzp=s.length-1;
	for(int i=s.length-1;i>=0;i--) {
		if(s[i]!=0) {
			s[nzp]=s[i];
			nzp--;
		}
	}while(nzp>=0) {
		s[nzp]=0;
		nzp--;
	}System.out.println(Arrays.toString(s));
	}

}
