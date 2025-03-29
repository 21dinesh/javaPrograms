package collectionPrograms;

import java.util.ArrayList;
import java.util.ListIterator;

public class learingListItr {
public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add("selenium");
	list.add("Apache POI");
	list.add("GitHub");
	list.add("TestNG");
	list.add("maven");
	
	
	ListIterator listItr = list.listIterator(); {
	
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		System.out.println("========================");
		while(listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
		System.out.println("===========================");
		//access the maven through next method
		ListIterator listItr1= list.listIterator(4);
		System.out.println(listItr1.next());
		System.out.println("===============");
		
		//access maven in reversr direction
		ListIterator listItr2= list.listIterator(5);
		System.out.println(listItr2.previous());
		
		
		
	}
	
}
}
