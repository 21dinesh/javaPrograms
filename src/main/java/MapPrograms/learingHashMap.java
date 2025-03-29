package MapPrograms;

import java.util.HashMap;

public class learingHashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> map= new HashMap<Integer, String>();
		map.put(98734, "kashi");
		map.put(85744, "Kumbakonam");
		map.put(32734, "Trupati");
		map.put(17734, "Dakshina Kashi"); 
		
		map.putAll(map);
		System.out.println(map);
		
	}

}
