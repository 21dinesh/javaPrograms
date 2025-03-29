package collectionPrograms;

import java.util.ArrayList;

public class RemovingElementFromList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("maven");
		list.add("postman");
		list.add("jmetter");
		list.add("TestNg");
		
		System.out.println(list);
		list.remove("postman");
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.clear();
		System.out.println(list);
	}

}
