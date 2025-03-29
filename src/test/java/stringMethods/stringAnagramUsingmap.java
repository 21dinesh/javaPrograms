package stringMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class stringAnagramUsingmap {
	
	    public static void main(String[] args) {
	        String[] strs = {"ate", "tea", "eat", "tan", "ban"};
	        
	        // Map to group anagrams
	        Map<String, List<String>> anagramMap = new HashMap<>();

	        for (String str : strs) {
	            // Sort the characters of the string to form the key
	            char[] charArray = str.toCharArray();
	            Arrays.sort(charArray);
	            System.out.println();
	            String sortedKey = new String(charArray);

	            // Add the string to the corresponding group in the map
	            anagramMap.computeIfAbsent(sortedKey, k -> new ArrayList<>()).add(str);
	        }

	        // Print groups of anagrams
	        for (Map.Entry<String, List<String>> entry : anagramMap.entrySet()) {
	            if (entry.getValue().size() > 1) { // Only print groups with more than one word
	                System.out.println(entry.getValue());
	            }
	        }
	    }
	}

