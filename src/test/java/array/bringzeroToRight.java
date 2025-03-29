package array;

import java.util.Arrays;
public class bringzeroToRight {
	public static void main(String[] args) {
		int[] arr= {1,0,2,0,3,0,4,5};
		int nzp = 0;
		for (int i=0;i<=arr.length-1;i++) {
			if (arr[i]!=0) {
				arr[nzp]=arr[i];
				nzp++;
			}
		}
		while(nzp<=arr.length-1) {
			arr[nzp]=0;
			nzp++;
		}
		System.out.println(Arrays.toString(arr));
	}

}
