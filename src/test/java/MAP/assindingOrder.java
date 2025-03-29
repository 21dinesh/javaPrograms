package MAP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class assindingOrder {
	public static void main(String[] args) {
		 String a[] = {"hello", "anytime", "there"};
	        String b[] = {"change", "time", "Manager"};

	        List<String> mergedList = new ArrayList(); 
	        mergedList.addAll(Arrays.asList(a));
	        mergedList.addAll(Arrays.asList(b));
	        TreeMap<String, Integer> map = new TreeMap<>();
	        for (String s : mergedList) {
	            map.put(s, s.length()); // Storing string with its length as the value
	        }

	        // Sort based on the map keys (lexicographically)
	        List<String> sortedList = new ArrayList<>(map.keySet());

	        // Print the sorted array
	        System.out.println("Sorted array: " + sortedList);
	}
}
