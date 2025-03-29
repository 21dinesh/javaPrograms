package array;

import java.util.ArrayList;

import java.util.LinkedHashMap;
import java.util.Map;


public class printthePosition {
public static void main(String[] args) {
	int[]a= {1,4,2,3,1,2,3,3,4};
	LinkedHashMap< Integer, ArrayList<Integer>> map=new LinkedHashMap<Integer, ArrayList<Integer>>();
	for (int i=0;i<a.length;i++) {
		if(map.containsKey(a[i])) {
			map.get(a[i]).add(i);
		}else {
		map.put(a[i], new ArrayList<Integer>())	;
		}
	}
	for (Map.Entry<Integer, ArrayList<Integer>> var:map.entrySet()){
		if(var.getValue().size()>0) {
			System.out.println(var.getKey()+" "+var.getValue());
		}
		
	}
}
}
