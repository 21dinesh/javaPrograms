package ReverseArrayPro;

import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class printDublicatedProsition {
	public static void main(String[] args) {
		int []a= {4,2,3,4,2,5,2,3};
		LinkedHashMap<Integer, ArrayList<Integer>> map= new LinkedHashMap();
		
		for (int i = 0; i < a.length; i++) {
			if(map.containsKey(a[i])){
				map.get(a[i]).add(i);
			}else {
				map.put(a[i], new ArrayList<Integer>());		
			}
			
		}
		for(Entry<Integer,ArrayList<Integer>> ref:map.entrySet()) {
			if(ref.getValue().size()>0) {
				System.out.println(ref.getKey()+"-"+ref.getValue()+"");
			} 
		}
	}
}
