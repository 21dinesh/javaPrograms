package mislineous;

import java.util.HashSet;

public class hashsetTreeset {
	public static void main(String[] args) {
		int [] a= {5,3,7,2,6,1,2,9};
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i : a) {
			hs.add(i);
			
		}System.out.println(hs);
	}

}
