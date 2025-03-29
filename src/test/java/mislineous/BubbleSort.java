package mislineous;

import java.util.Arrays;
import org.testng.annotations.Test;

public class BubbleSort {
    @Test
    public void sort() {
        //int a[] = {2, 4, 2, 5, 63, 8, 9, 4};

        // Bubble Sort Algorithm
//        for (int i = 0; i < a.length - 1; i++) {  // Loop till second last element
//            for (int j = 0; j < a.length-1; j++) { // Last i elements are already sorted
//                if (a[j] > a[j + 1]) {  // Swap if current element is greater than next
//                    int temp = a[j];
//                    a[j] = a[j + 1];
//                    a[j + 1] = temp;
//                }
//            } 
//        }
//        System.out.println("Sorted Array: " + Arrays.toString(a)); // Print sorted array
    
    int a[]= {1,4,2,6,9,87,8,6,5,544,44};
    int temp=0;
    for (int i = 0; i < a.length-1; i++) {
		for (int  j = 0;  j< a.length-1;  j++) {
			if(a[j]>a[j+1]) {
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}}
	System.out.println(Arrays.toString(a));
    
    }
}
