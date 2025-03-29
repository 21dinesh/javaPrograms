package LearingEntrySet;

import java.util.HashMap;
import java.util.Map;

import lombok.experimental.var;

public class learnEntrySet {
	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<>();
		map.put("dk", 101);
		map.put("deeno", 21);
		map.put("raja", 99);
		map.put("dinu", 100);
		for (Map.Entry<String, Integer> var:map.entrySet())
		{
			System.out.println(var.getKey()+" "+var.getValue());
			
		}
	}
}

