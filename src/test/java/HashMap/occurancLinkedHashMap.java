package HashMap;

import java.util.LinkedHashMap;

public class occurancLinkedHashMap {
	public static void main(String[] args) {
		String ip="aabbccaabbddee";
		LinkedHashMap<Character, Integer> lhm= new LinkedHashMap<>();
		for(int i=0;i<ip.length();i++) {
			char ch =ip.charAt(i);
			if (lhm.containsKey(ch)) {
				lhm.put(ch, lhm.get(ch)+1);
				
			}//else
				//lhm.put(s, null)	
		}
		System.out.println(lhm);
	}

}
