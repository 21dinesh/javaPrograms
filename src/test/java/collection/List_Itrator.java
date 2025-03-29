package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class List_Itrator {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("Rose");
		list.add("Jesmeen");
		list.add("lily");
		list.add("Lotus");
		
		ListIterator listItr=  list.listIterator();
		
		while (listItr.hasNext()) {
			System.out.println(listItr.next());
			
		}
		System.out.println("==============================");
		ListIterator listItr2=  list.listIterator();
		while (listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		
		
	}
	}
}
