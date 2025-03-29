package array;

import java.util.LinkedHashSet;

public class sumElementToSepNum {
	public static void main(String[] args) {
		int[] in= {10,5,7,8,6,9,7,10};
		//sum of two elementin the array should be equal to this sum
		int TergetSum=15;
		//we dont wnt dublicate pairs
		LinkedHashSet<String> set= new LinkedHashSet<String>();
		//featch one element frm array
		for(int i =0;i<in.length; i++) {
			//used to remaining elements to the given element a[i]
			for(int j=i+1;j<in.length;j++) {
				//every time inner loop starts op isintiallized to empty string
				String op="";
			if(in[i]+in[j]==TergetSum) {
				//formating the output
				op=(in[i]>in[j])?("("+in[j]+","+in[i]+")"):("("+in[i]+","+in[j]+")");
				//adding it to hash set
				set.add(op);
			}
		}		
		}System.out.println(set);
	}
}
