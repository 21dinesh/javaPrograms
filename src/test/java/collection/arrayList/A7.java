package collection.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class A7 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("Shiva");
		a.add("Chamundi");
		a.add("Ganesha");
		a.add("balaji");
		
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
	}

}
