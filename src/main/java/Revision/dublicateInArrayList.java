package Revision;

import java.util.LinkedHashSet;

public class dublicateInArrayList {
	public static void main(String[] args) {
		Integer n[]= {1,2,2,3,4,4,3};
		LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
		for(Integer num : n) {
			hs.add(num);
		}System.out.println(hs);
		
	}

}
 