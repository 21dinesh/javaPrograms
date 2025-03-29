package Revision;

import java.util.LinkedHashMap;

public class occurance {
	public static void main(String[] args) {
		String s="aabbaabcc";
		LinkedHashMap<Character, Integer> hm= new LinkedHashMap();	
        
		for (int i = 0; i < s.length(); i++) {
         char ch= s.charAt(i);
         if(hm.containsKey(ch)) {
        	hm.put(ch, hm.get(ch)+1);
        	
         }else {
        	 hm.put(ch, 1);
         }
         
		}System.out.println(hm);
	}

}
