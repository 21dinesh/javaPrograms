package HashMap;

import java.util.HashMap;

public class enterValueHashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> map= new HashMap<Integer, String>();
		map.put(1, "abhishke");
		map.put(2, "Amit");
		map.put(4, "aamir");
		map.put(3, "Srk");
		
		System.out.println("Size of the map is "+ map.size());
		System.out.println("values in the map are" + map );
	}

}
