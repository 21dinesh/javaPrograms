package Revision;

import java.util.LinkedHashMap;

public class OcceranceOfWord {
public static void main(String[] args) {
	String s="Dinesh is my is my name";
	String ar[]=s.split(" ");
	LinkedHashMap <String , Integer> hm= new LinkedHashMap(); 
	 
	for(String word:ar){	
	  if (hm.containsKey(word)) {
		  
	  hm.put(word, hm.get(word)+1);
	  }else {
		  hm.put(word, 1);
	  }
	  }System.out.println(hm);
	}
}
