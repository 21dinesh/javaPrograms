package collectionPrograms;

import java.util.ArrayList;

public class LearningForEach {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("tanuja");
		list.add("vijayLakshmi");
		list.add("Chinmy");
		list.add("neha");
		
		for(Object o: list) {
			System.out.println(o);
		}
	}

}
