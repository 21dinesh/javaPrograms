package MAP;

import java.util.HashMap;
import java.util.Map;

public class map2 {
public static void main(String[] args) {
	HashMap<String, String> hash = new HashMap();
	hash.put("Abhi", "ash");
	hash.put("virat", "anushka");	
	hash.put("ranveer", "deepika");	
	hash.put("xyz", "BMW");
	
//	hash.remove("abhi");
//	System.out.println(hash);
//	hash.remove("virat");
//	System.out.println(hash);
//	hash.clear();
//	System.out.println(hash);
	
//	System.out.println(hash.containsKey("xyz"));  //true
//	System.out.println(hash.containsValue("ash"));  //true
//	System.out.println(hash.containsValue("xyz"));  //fales

//	System.out.println(hash.keySet());//print only keys
//	System.out.println(hash.values());// print only values
	
//	hash.replace("xyz", "X7");
//	System.out.println(hash);
//	hash.replace("xyz", "X7", "X6"); // replace meth is overloaded
//	System.out.println(hash);
	
//	System.out.println(hash.get("xyz"));
//	System.out.println(hash.get("mercedes"));
//	System.out.println(hash.getOrDefault("mercedes" ,"benz"));
	
	for (Map.Entry<String, String> map :hash.entrySet()) {
		System.out.println(map.getKey()+":"+ map.getValue());
		
	}
	
}
}
