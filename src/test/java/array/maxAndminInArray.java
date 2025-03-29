package array;

import java.util.Arrays;
import java.util.Iterator;

public class maxAndminInArray {
	public static void main(String[] args) {
		int arr[]= {4,3,25,6,78,98};
		        int n= 3;
		        for(int i=0;i<arr.length;i++){
		        int maxC=0;
		        int minC=0;
		        for(int j=0;j<arr.length;j++){
		            if(arr[j]<arr[i])
		            minC++;
		            if(arr[j]>arr[i])
		            maxC++;
		            }
		        if(minC==n-1){
		        System.out.println(arr[i] +" is "+n+" rd min");
		        }
		        if(maxC==n-1){
		        System.out.println(arr[i]+" is "+n+" rd max");
		        }
		        }
		            Arrays.sort(arr);
		 for (int j = 0; j < arr.length; j++) {
		 System.out.println(arr[j]);   
		 }
	}}