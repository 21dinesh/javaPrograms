package MAP;

import java.util.HashMap;
import java.util.TreeMap;

public class tMap1 {
	public static void main(String[] args) {
		TreeMap tree = new TreeMap();
		tree.put("Abhi", "ash");
		tree.put("virat", "anushka");	
		tree.put("ranveer", "deepika");	
		tree.put("xyz", "BMW");
		
		
		tree.remove("abhi");
		System.out.println(tree);
		tree.remove("virat");
		System.out.println(tree);
		tree.clear();
		System.out.println(tree);
		
	}

}
