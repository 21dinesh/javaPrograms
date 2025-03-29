package array;

import java.util.Arrays;

public class anagramString {
	public static void main(String[] args) {
		
		System.out.println(areAnagram("heart","earth"));
		
	}
	public static boolean areAnagram(String str1, String str2) {
		
		if(str1.length()!=str2.length()) {
			return false; 
		}
		char[]c1=str1.toCharArray();		
		char[]c2=str2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1, c2);
		
		
	}

}
