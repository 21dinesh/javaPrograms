package Revision;

import java.util.LinkedHashSet;

public class removingDublicate {
	public static void main(String[] args) {
		String s="my name is name is Dinesh";
		String ar[]=s.split(" ");
		LinkedHashSet<String > hs= new LinkedHashSet<>();
		   
		for (String word:ar) {
			hs.add(word);
			
			
		}System.out.println(hs);
	}

}
