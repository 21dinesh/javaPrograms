package collectionPrograms;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class learingContainsInList {
	public static void main(String[] args) {
		ArrayList list= new ArrayList();
		list.add("Thailand");
		list.add("USA");
		list.add("Nepal");
		list.add("Australia");
		
		System.out.println(list.contains("Thiland"));
		
		ArrayList list1= new ArrayList();
		list1.add("USA");		
		list1.add("Nepal");		
		list1.add("Russia");
		System.out.println(list.contains(list1));
		System.out.println(list1.indexOf("Nepal"));
		
	}

}
