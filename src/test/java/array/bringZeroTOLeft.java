package array;

import java.util.Arrays;

public class bringZeroTOLeft {
	public static void main(String[] args) {
		int[] arr= {1,0,2,0,3,0,4,5};
		int nzp = arr.length-1;
		for (int i=arr.length-1;i>=0;i--) {
			if (arr[i]!=0) {
				arr[nzp]=arr[i];
				nzp--;
			}
		}
		while(nzp>=0) {
			arr[nzp]=0;
			nzp--;
		}
		System.out.println(Arrays.toString(arr));
	}

}
