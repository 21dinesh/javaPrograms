package collectionPrograms;

import java.util.ArrayList;

public class UpdateList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("eat");
		list.add("sleep");
		list.add("repeat");
		
		System.out.println(list);
		list.set(1, "I ate");
		System.out.println(list);
		
		
	}

}
