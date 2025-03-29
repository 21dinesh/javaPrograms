package MAP;

import java.util.HashMap;
import java.util.Map;

	public class uniqueOccerrence {
		public static void main(String[] args) {
		
	String s = "aabadcdcccdfg";
	 Map<Character, Integer> countMap = new HashMap<>();
	 for (int i=0;i<s.length();i++) {
				 
//			 if(countMap.containsKey(s.charAt(i))) {
//	    		 int count = countMap.get(s.charAt(i));
//		    	 countMap.put(s.charAt(i),count+1);
// 
//			 }else {
//  			 countMap.put(s.charAt(i),1);
//			 }
				 
	 countMap.put(s.charAt(i), countMap.getOrDefault(s.charAt(i), 0)+1);
	 }
	System.out.println("occerrance the char"+countMap);
	}
}



