package ReverseArrayPro;

import java.util.Arrays;

public class sumOfTwoArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {1,2,3,4,5,6,7,8};
		int cLenth=Math.max(a.length, b.length);
		
		int sum[]  =new int[cLenth];  
		for (int i = 0; i < cLenth; i++) {
			if(i<a.length) {
				sum[i]+=a[i];
			}
			if(i<b.length) {
				sum[i]+=b[i];
			}
		}System.out.println(Arrays.toString(sum));
	}

}
 