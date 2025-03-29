package stringMethods;

import java.util.Arrays;

public class removeDuplicateinArray {
	public static void main(String[] args) {
		int []arr= {1,2,34,5,3,3,2,1};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					arr[i]=-1;
				}
			}
		}for (int i = 0; i < arr.length; i++) {
			if (arr[i]>0) {
			 System.out.print(arr[i]+ " ");
			 System.out.println(Arrays.toString(arr));
			} 
		} 
	}

}
