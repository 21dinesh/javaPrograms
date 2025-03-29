package InterviewQus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class anagramString {
public static void main(String[] args) {
	String s[]= {"ate", "tea", "eat","tan", "ban","ant" };
   HashMap<String, ArrayList<String>> map=new HashMap();
   for(String str:s) {
	   char[] ch=str.toCharArray();
	   Arrays.sort(ch);
	   String ns = new String(ch);
	   if(map.containsKey(ns)) {
		   map.get(ns).add(str);
	   }
       else {
    	   map.put(ns, new ArrayList<>());
    	   map.get(ns).add(str);
	   
   }
   }
   for (List<String> var:map.values()) {
	   System.out.println(var);
   }
   
}}

