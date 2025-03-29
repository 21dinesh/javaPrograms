package stringMethods;

import java.util.Arrays;

public class reverseOnlycharacter {
	public static void main(String[] args) {
		String str="my name is dinesh";
		String str2="";
		String a[]=str.split(" ");
		for (String string : a) {
			
		    String rev= "";
			for (int j = string.length()-1; j >=0 ; j--) {
			char ch=string.charAt(j);
			rev=rev+ch;
			
		}
		
		System.out.print(rev+" ");
	}

}}
