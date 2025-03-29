package Sorting;

import java.util.Arrays;

public class bubbleSort {
	public static void sort(int[] arr ) {	
		int n=arr.length;
		boolean swapped;
		for (int i=0;i<n;i++) {
			swapped=false;
			for (int j = 0;j<n-1-i;j++) {
				if (arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped =true; //mark the we made swap
				}			
			}
			//if no elements were swapped during a pass, array is sorted
			if (!swapped) {
				break;
			}
		}
	}
	public static void main(String[] args) {
		 int[] arr = {24,38,22,93,44,12};
		 sort(arr);
		 System.out.println("Sorted array"+ Arrays.toString(arr));
	}
}
