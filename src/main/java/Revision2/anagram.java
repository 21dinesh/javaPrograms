package Revision2;

import java.util.Arrays;

public class anagram {
	public static void main(String[] args) {
		String s1="Race";
		
		String s2="Case";
		
		if(s1.length()==s2.length()) {
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if (Arrays.equals(ch1, ch2))
		
		{
			System.out.println("anagram");
		}
			
	    }   else {
			System.out.println("not anagram");
		}
	}

}
