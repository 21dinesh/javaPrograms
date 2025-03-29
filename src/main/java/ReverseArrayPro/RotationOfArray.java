package ReverseArrayPro;

import java.util.Arrays;
public class RotationOfArray {
	public static void main(String[] args) {
		String s="My Name is Dinesh";
		String str[]=s.split(" ");
		 
		for (int i=0; i<3 ; i++) {
		   String temp = str[0];
		 
		    for (int j = 1; j < str.length; j++) {
			   str[j-1] = str[j];
			
		}
		str[str.length-1]=temp;
		
		}
	System.out.println(Arrays.toString(str));
	}
}
