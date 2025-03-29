package ReverseArrayPro;

import java.util.Arrays;

public class shiftZeroToleftSide {
	public static void main(String[] args) {
		int a[]= {2,0,3,9,7,0,0,5,1,0};
		
		int res[]= new int[a.length]; 
		//System.out.println(Arrays.toString(res));
		int index=res.length-1;
		
		for (int i = index; i>=0; i--) {
			if(a[i]!=0) {
				res[index--] = a[i];
			}
		}
		System.out.println(Arrays.toString(res));
	}

}
